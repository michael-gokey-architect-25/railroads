package com.railyard.repository;

import com.railyard.model.Yard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YardRepository extends JpaRepository<Yard, Long> {
}
