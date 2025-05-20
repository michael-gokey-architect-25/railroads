

Mock data in unit tests is used to simulate real objects, without needing the actual database or external systems. Here's a quick overview of what mock data might look like for your rail yard system, especially in the context of your `Car`, `Route`, `Train`, and `Yard` entities.

---

### 🔧 **1. Car Entity Mock Example**

```java
Car mockCar = new Car();
mockCar.setId(1L);
mockCar.setType("Boxcar");
mockCar.setLoadType("Electronics");
mockCar.setWeight(30000);
mockCar.setTrainId(1L);
```

---

### 🚂 **2. Train Entity Mock Example**

```java
Train mockTrain = new Train();
mockTrain.setId(1L);
mockTrain.setTrainNumber("NS9001");
mockTrain.setRouteId(101L);
mockTrain.setDepartureTime(LocalDateTime.of(2023, 5, 20, 8, 30));
mockTrain.setArrivalTime(LocalDateTime.of(2023, 5, 20, 18, 45));
mockTrain.setStatus("In Transit");
```

---

### 🛤️ **3. Route Entity Mock Example**

```java
Route mockRoute = new Route();
mockRoute.setId(101L);
mockRoute.setOrigin("Atlanta");
mockRoute.setDestination("Chicago");
mockRoute.setDistance(715.5);
mockRoute.setEstimatedTravelTime(12.5);
```

---

### 🏭 **4. Yard Entity Mock Example**

```java
Yard mockYard = new Yard();
mockYard.setId(201L);
mockYard.setName("South Norfolk Yard");
mockYard.setLocation("Norfolk, VA");
mockYard.setCapacity(100);
```

---

### 👨‍🔧 How You'd Use Mock Data in Unit Tests

In your service layer tests (with `@Mock` and `@InjectMocks`), you can `when(...).thenReturn(...)` to simulate database calls:

```java
when(repository.findById(1L)).thenReturn(Optional.of(mockTrain));
```

Or for controller tests with `MockMvc`, you can:

```java
when(trainService.getAllTrains()).thenReturn(Arrays.asList(mockTrain));
```

---

### 🧪 Tip: Make Reusable Mock Factories

To keep tests clean, you might create helper methods like:

```java
public static Train createMockTrain() {
    Train t = new Train();
    t.setId(1L);
    t.setTrainNumber("NS123");
    // ... other fields
    return t;
}
```

This way, all tests use the same consistent mock structure. 


----------

Benefits:
Use in unit tests, integration tests, or even demo environments.

Easily plug into your JUnit test classes like:

```java
Train train = MockFactory.createMockTrain();
when(trainRepository.findById(1L)).thenReturn(Optional.of(train));
```

