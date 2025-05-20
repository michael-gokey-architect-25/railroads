import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { YardListComponent } from './components/yard-list.component';
import { YardsRoutingModule } from './yards-routing.module';

@NgModule({
  declarations: [YardListComponent],
  imports: [CommonModule, YardsRoutingModule]
})
export class FeatureYardsModule {}
