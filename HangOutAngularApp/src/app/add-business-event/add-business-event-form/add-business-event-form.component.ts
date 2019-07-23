import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { EventAddBusiness } from 'src/app/event-add-business';
import { EventService } from 'src/app/event.service';
import { Router } from '@angular/router';
import { LoggedInUserService } from 'src/app/logged-in-user.service';


@Component({
  selector: 'app-add-business-event-form',
  templateUrl: './add-business-event-form.component.html',
  styleUrls: ['./add-business-event-form.component.css']
})
export class AddBusinessEventFormComponent implements OnInit {

  title: string;
  location: string;
  timeOfEvent: string;
  dateOfEvent: string;
  description: string;
  businessMessage: string;
  response: boolean;

  eventAddBusiness: EventAddBusiness;
  constructor(private eventService: EventService, private router: Router,
              private loggedInUserService: LoggedInUserService) { }

  ngOnInit() {
  }

  onCreate() {
    // Passing to server
    this.eventAddBusiness = new EventAddBusiness(this.title, this.location, this.timeOfEvent, this.dateOfEvent,
      this.description, this.businessMessage);
    // tslint:disable-next-line: max-line-length
    this.eventService.postEvent('BusinessUser/BusinessUserEventManager/BusinessUserAddBusinessEvent', this.eventAddBusiness);

     // TODO need to fix navigating before loading all events
    this.router.navigate(['BusinessUser/BusinessUserEventManager']);

    }
}
