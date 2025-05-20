import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './core/guards/auth.guard';

const routes: Routes = [
  {
    path: 'trains',
    loadChildren: () => import('./feature-trains/feature-trains.module').then(m => m.FeatureTrainsModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'yards',
    loadChildren: () => import('./feature-yards/feature-yards.module').then(m => m.FeatureYardsModule),
    canActivate: [AuthGuard]
  },
  {
    path: '',
    redirectTo: 'trains',
    pathMatch: 'full'
  },
  {
    path: '**',
    redirectTo: 'trains'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
