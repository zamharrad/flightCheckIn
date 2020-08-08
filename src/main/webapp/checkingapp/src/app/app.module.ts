import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { CheckinComponent } from "./components/checkin/checkin.component";
import { StartcheckinComponent } from "./components/startcheckin/startcheckin.component";
import { ConfirmcheckinComponent } from "./components/confirmcheckin/confirmcheckin.component";
import { HttpClient } from "@angular/common/http";
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from "@angular/forms";
import { DataService } from "./services/data.service";

@NgModule({
  declarations: [
    AppComponent,
    CheckinComponent,
    StartcheckinComponent,
    ConfirmcheckinComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule,HttpClientModule],
  providers: [DataService],
  bootstrap: [AppComponent],
})
export class AppModule {}
