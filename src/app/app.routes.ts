import {RouterModule, Routes} from '@angular/router';
import {RegisterComponent} from "./components/register/register.component";
import {LoginComponent} from "./components/login/login.component";
import {NgModule} from "@angular/core";

export const routes: Routes = [
  { path: '', redirectTo: 'register', pathMatch: 'full' }, // redirection par défaut
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
];

export class AppRoutingModule { }
