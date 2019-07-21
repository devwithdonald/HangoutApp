import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Event } from 'src/app/event';
import { EventUpdate } from 'src/app/event-update';


@Component({
  selector: 'app-basic-user-update-event-form',
  templateUrl: './basic-user-update-event-form.component.html',
  styleUrls: ['./basic-user-update-event-form.component.css']
})
export class BasicUserUpdateEventFormComponent implements OnInit {

  event: EventUpdate;
  eventUpdateResponse: boolean;
  validation: boolean;

  // don't update on get request
  private eventId: number;

  // this information will be change on user event Id input
  private eventTitle: string;
  private eventDescription: string;
  private eventLocation: string;
  private eventTime: string;
  private eventDate: string;

  // new Event()

  // FAKE DATA
  // private eventTitle = 'fake title';
  // private eventDescription = 'sdfoijsdofijsoidjfsoijdf';
  // private eventTime = '15:23:00';
  // private eventDate = '2019-02-24';


  constructor(private router: Router, private http: HttpClient) { }

  ngOnInit() {
  }

  onUpdateEvent() {
    // TODO
    // this should get fired off every time the user inputs something
    // should be a get request to populate the values in the table

    this.event = new EventUpdate(this.eventId, this.eventTitle, this.eventLocation, this.eventTime, this.eventDate, this.eventDescription);
    // get request
    this.http.post('http://localhost:8080/HangoutApp/BasicUser/PrivateEvents/UpdateEvent', this.event).subscribe(
      (response: boolean) => {
        this.validation = response;
      }
    );
    if (this.validation === true) {
      // TODO optional send user comfirmation that update was made
      this.http.put('http://localhost:8080/HangoutApp/BasicUser/PrivateEvents/UpdateEvent', this.event)
        .subscribe(
          (response: boolean) => {
            this.eventUpdateResponse = response;
          }
        );
    } else {
      alert('Invalid event id');
    }
    // if response from get request is not null then update the form
    // if (response !== false){
    //   this.eventTitle = returnedEventTitle;
    //   this.eventDescription =  returnedEventDescription;
    //   this.eventTime = returnedEventTime;
    //   this.eventDate = returnedEventDate;
    // }

  }

  // onUpdateEvent() {
  //   // Need to send to db
  //   this.router.navigate(['/BasicUser/PrivateEvents']);
  //   console.log(`Event Id: ${this.eventId}`);
  //   console.log(`Event Title: ${this.eventTitle}`);
  //   console.log(`Event Description: ${this.eventDescription}`);
  //   console.log(`Time of Event: ${this.eventTime}`);
  //   console.log(`Date of Event: ${this.eventDate}`);
  // }

}
