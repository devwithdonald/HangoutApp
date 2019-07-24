import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Event } from 'src/app/event';
import { EventUpdate } from 'src/app/event-update';
import { LoggedInUserService } from 'src/app/logged-in-user.service';


@Component({
  selector: 'app-basic-user-update-event-form',
  templateUrl: './basic-user-update-event-form.component.html',
  styleUrls: ['./basic-user-update-event-form.component.css']
})
export class BasicUserUpdateEventFormComponent implements OnInit {

  event: EventUpdate;
  eventUpdateResponse: boolean;
  validation: boolean;


  private eventId: number;

  // this information will be change on user event Id input
  private eventTitle: string;
  private eventDescription: string;
  private eventLocation: string;
  private eventTime: string;
  private eventDate: string;

  constructor(private router: Router, private http: HttpClient, private loggedInUserService: LoggedInUserService) { }

  ngOnInit() {
  }

  onUpdateEvent() {

    this.event = new EventUpdate(this.eventId, this.eventTitle, this.eventLocation, this.eventTime, this.eventDate, this.eventDescription, this.loggedInUserService.loggedInUser);

    this.http.post('http://localhost:8080/HangoutApp/BasicUser/PrivateEvents/UpdateEvent', this.event).subscribe(
      (response: boolean) => {
        this.validation = response;
      }
    );

    if (this.validation === false) {
      alert(`Couldn't update event! Try again.`);
    } else {
      //this.router.navigate(['/BasicUser/PrivateEvents/']);
    }

  }

}
