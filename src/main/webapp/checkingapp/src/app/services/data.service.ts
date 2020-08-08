import { Injectable } from "@angular/core";
import { map } from "rxjs/operators";
import { Observable } from "rxjs";
import { HttpClient, HttpHeaders, HttpResponse } from "@angular/common/http";


@Injectable({
  providedIn: "root",
})
export class DataService {
  URL: string = "http://localhost:8080/flightreservation/reservations/";
  constructor(private _http: HttpClient) {}

  public getReservation(id: number): any {
    return this._http.get(this.URL + id).pipe(
      map(
        (response) => {
          return response;
        },
        (error) => {
          console.log(error);
        }
      )
    );
  }

  public checkin(checkInRequest): any {
    return this._http.post(this.URL, checkInRequest).pipe(
      map(
        (response) => {
          return response;
        },
        (error) => {
          return console.log(error);
        }
      )
    );
  }
}
