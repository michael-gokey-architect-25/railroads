import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TrainListComponent } from './components/train-list.component';
import { TrainsRoutingModule } from './trains-routing.module';

@NgModule({
  declarations: [TrainListComponent],
  imports: [CommonModule, TrainsRoutingModule]
})
export class FeatureTrainsModule {}
