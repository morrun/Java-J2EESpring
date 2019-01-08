import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Home/Head/header.component';
import { UserComponent } from './Content/user/user.component';
import { ProductComponent } from './Content/products/products.component';
import { FooterComponent } from './Home/Foot/footer.component';
import { AuthRouteGuard } from './Shared/Guard/guard.service';
import { CustomPipe } from './Shared/Pipe/custom-pipe.pipe';
import { UserService } from './Shared/Services/user.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    UserComponent,
    ProductComponent,
    FooterComponent,
    // CustomPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [AuthRouteGuard, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
