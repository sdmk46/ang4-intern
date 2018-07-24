import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AddComponent } from './add/add.component';
import { SubComponent } from './sub/sub.component';
import { MulComponent } from './mul/mul.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { CategoryComponent } from './category/category.component';
import { FooterComponent } from './footer/footer.component';
import { CuComponent } from './cu/cu.component';
import { AuComponent } from './au/au.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    AddComponent,
    SubComponent,
    MulComponent,
    LoginComponent,
    RegisterComponent,
    CategoryComponent,
    FooterComponent,
    CuComponent,
    AuComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
        { path:'addition',component:AddComponent },
        {path:'subtraction',component:SubComponent},
        {path:'login',component:LoginComponent},
        {path:'category/:cat',component:CategoryComponent},
        {path:'cu',component:CuComponent},
        {path:'au',component:AuComponent},
      ])
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
