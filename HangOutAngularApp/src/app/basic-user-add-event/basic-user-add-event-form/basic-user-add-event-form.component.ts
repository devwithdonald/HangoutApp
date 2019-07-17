import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-basic-user-add-event-form',
  templateUrl: './basic-user-add-event-form.component.html',
  styleUrls: ['./basic-user-add-event-form.component.css']
})
export class BasicUserAddEventFormComponent implements OnInit {

  private eventTitle: string;
  private eventDescription: string;
  private eventTime: string;
  private eventDate: string;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  onAddEvent() {
    // Need to send to db
    this.router.navigate(['/BasicUser/PrivateEvents']);
    console.log(`Event Title: ${this.eventTitle}`);
    console.log(`Event Description: ${this.eventDescription}`);
    console.log(`Time of Event: ${this.eventTime}`);
    console.log(`Date of Event: ${this.eventDate}`);
  }

}
