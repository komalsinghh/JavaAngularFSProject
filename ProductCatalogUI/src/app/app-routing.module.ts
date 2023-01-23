import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CactivateGuard } from './guards/cactivate.guard';
import { HomeComponent } from './pages/home/home.component';
import { ProductDetailsComponent } from './pages/product-details/product-details.component';
import { RegisterComponent } from './pages/register/register.component';
import { SearchComponent } from './pages/search/search.component';
import { UloginComponent } from './pages/ulogin/ulogin.component';

const routes: Routes = [
  {path:'register', component:RegisterComponent, pathMatch:'full'},
  {path:'', component:UloginComponent, pathMatch:'full'},
  {path:'home', component:HomeComponent, canActivate:[CactivateGuard],pathMatch:'full'},
  {path:'search', component:SearchComponent,canActivate:[CactivateGuard], pathMatch:'full'},
  {path:'pdetails/:id', component:ProductDetailsComponent,canActivate:[CactivateGuard], pathMatch:'full'}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
