import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-basic-user-update-event-form',
  templateUrl: './basic-user-update-event-form.component.html',
  styleUrls: ['./basic-user-update-event-form.component.css']
})
export class BasicUserUpdateEventFormComponent implements OnInit {

  // don't update on get request
  private eventId: string;

  // this information will be change on user event Id input
  private eventTitle: string;
  private eventDescription: string;
  private eventTime: string;
  private eventDate: string;


  // FAKE DATA
  // private eventTitle = 'fake title';
  // private eventDescription = 'sdfoijsdofijsoidjfsoijdf';
  // private eventTime = '15:23:00';
  // private eventDate = '2019-02-24';


  constructor(private router: Router) { }

  ngOnInit() {
  }

  updateForm() {
    // TODO
    // this should get fired off every time the user inputs something
    // should be a get request to populate the values in the table

    // if response from get request is not null then update the form
    // if (response !== null){
    //   this.eventTitle = returnedEventTitle;
    //   this.eventDescription =  returnedEventDescription;
    //   this.eventTime = returnedEventTime;
    //   this.eventDate = returnedEventDate;
    // }

  }

  onUpdateEvent() {
    // Need to send to db
    this.router.navigate(['/BasicUser/PrivateEvents']);
    console.log(`Event Id: ${this.eventId}`);
    console.log(`Event Title: ${this.eventTitle}`);
    console.log(`Event Description: ${this.eventDescription}`);
    console.log(`Time of Event: ${this.eventTime}`);
    console.log(`Date of Event: ${this.eventDate}`);
  }

}
