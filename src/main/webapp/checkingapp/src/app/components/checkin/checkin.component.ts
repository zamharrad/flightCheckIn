import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { DataService } from "src/app/services/data.service";

@Component({
  selector: "app-checkin",
  templateUrl: "./checkin.component.html",
  styleUrls: ["./checkin.component.scss"],
})
export class CheckinComponent implements OnInit {
  data: any;
  constructor(private route: ActivatedRoute, private service: DataService) {}

  ngOnInit(): void {
    let id = Number.parseInt(this.route.snapshot.paramMap.get("id"));
    this.service.getReservation(id).subscribe((res) => {
      this.data = res;
      console.log(this.data);
    });
  }
}
