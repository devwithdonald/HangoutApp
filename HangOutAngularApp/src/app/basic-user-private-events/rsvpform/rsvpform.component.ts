import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RSVP } from 'src/app/rsvp-dto';
import { LoggedInUserService } from 'src/app/logged-in-user.service';

@Component({
  selector: 'app-rsvpform',
  templateUrl: './rsvpform.component.html',
  styleUrls: ['./rsvpform.component.css']
})
export class RSVPFormComponent implements OnInit {

  eventId: number;

  constructor(private http: HttpClient, private loggedIn: LoggedInUserService) { }

  ngOnInit() {
  }

  onAccept() {
    const url = 'http://localhost:8080/HangoutApp/BasicUser/Events';
    const rsvp = new RSVP('Accepted', this.eventId, this.loggedIn.loggedInUser);
    console.log(`${this.eventId}`);

    console.log(JSON.stringify(rsvp));
    return this.http.post(url, rsvp).subscribe(Boolean);
  }

  onReject() {
    const url = 'http://localhost:8080/HangoutApp/BasicUser/Events';
    const rsvp = new RSVP('Rejected', this.eventId, this.loggedIn.loggedInUser);
    console.log(rsvp);
    return this.http.post(url, rsvp).subscribe(Boolean);
  }
}
