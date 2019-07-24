import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RSVP } from 'src/app/rsvp-dto';

@Component({
  selector: 'app-rsvpform',
  templateUrl: './rsvpform.component.html',
  styleUrls: ['./rsvpform.component.css']
})
export class RSVPFormComponent implements OnInit {

  eventId: number;

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  onAccept() {
    const url = 'http://localhost:8082/HangoutApp/BasicUser/Events';
    const rsvp = new RSVP('Accepted', this.eventId);
    console.log(`${this.eventId}`);

    console.log(JSON.stringify(rsvp));
    return this.http.post(url, rsvp).subscribe(Boolean);
  }

  onRejected() {
    const url = 'http://localhost:8082/HangoutApp/BasicUser/Events';
    const rsvp = new RSVP('Rejected', this.eventId);
    console.log(rsvp);
    return this.http.post(url, rsvp).subscribe(Boolean);
  }
}
