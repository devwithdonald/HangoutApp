import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RSVP } from 'src/app/RSVP';

@Component({
  selector: 'app-rsvpform',
  templateUrl: './rsvpform.component.html',
  styleUrls: ['./rsvpform.component.css']
})
export class RSVPFormComponent implements OnInit {

  id: number;

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  onAccept() {
    const url = 'http://localhost:8080/HangoutApp/BasicUser/Events';
    const rsvp = new RSVP();
    rsvp.EventId = this.id;
    rsvp.Status = 'Accepted';
    return this.http.post(url, rsvp).subscribe(Boolean);
  }

  onRejected() {
    const url = 'http://localhost:8080/HangoutApp/BasicUser/Events';
    const rsvp = new RSVP();
    rsvp.EventId = this.id;
    rsvp.Status = 'Rejected';
    return this.http.post(url, rsvp).subscribe(Boolean);
  }
}
