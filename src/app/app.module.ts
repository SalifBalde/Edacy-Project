// src/app/app.module.ts

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms'; // pour les formulaires
import { HttpClientModule } from '@angular/common/http'; // pour les requêtes HTTP

import { AppComponent } from './app.component';
import {MatButtonModule} from "@angular/material/button";
import {MatFormFieldModule} from "@angular/material/form-field";
import {AppRoutingModule} from "./app.routes";
import {RegisterComponent} from "./components/register/register.component";
import { MatInputModule } from '@angular/material/input';
import {RouterModule} from "@angular/router";


@NgModule({
    declarations: [

    ],
    imports: [

    ],
    providers: [],
    bootstrap: []
})
export class AppModule { }
