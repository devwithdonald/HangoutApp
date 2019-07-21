import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { EventAdd } from 'src/app/event-add';
import { EventService } from 'src/app/event.service';

@Component({
  selector: 'app-basic-user-add-event-form',
  templateUrl: './basic-user-add-event-form.component.html',
  styleUrls: ['./basic-user-add-event-form.component.css']
})
export class BasicUserAddEventFormComponent implements OnInit {
  eventAdd: EventAdd;
  title: string;
  description: string;
  location: string;
  timeOfEvent: string;
  dateOfEvent: string;

  constructor(private http: HttpClient, private router: Router, private eventService: EventService) { }

  ngOnInit() {
  }

  onAddEvent() {
    console.log(`-- adding event --`);
    console.log(`Event Title: ${this.title}`);
    console.log(`Event Description: ${this.description}`);
    console.log(`Location: ${this.location}`);
    console.log(`Time of Event: ${this.timeOfEvent}`);
    console.log(`Date of Event: ${this.dateOfEvent}`);

    // Passing to server
    this.eventAdd = new EventAdd(this.title, this.location, this.timeOfEvent, this.dateOfEvent,
    this.description);
    this.eventService.postEvent('BasicUser/PrivateEvents/AddEvent', this.eventAdd);

    // this.router.navigate(['/BasicUser/PrivateEvents']);
  }

}
