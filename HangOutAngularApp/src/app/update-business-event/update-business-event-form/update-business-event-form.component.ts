import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { BusinessUserService } from 'src/app/BusinessUser.service';
import { EventUpdate } from 'src/app/event-update';
import { EventUpdateBusiness } from 'src/app/event-update-business';
import { Router } from '@angular/router';
import { EventService } from 'src/app/event.service';

@Component({
  selector: 'app-update-business-event-form',
  templateUrl: './update-business-event-form.component.html',
  styleUrls: ['./update-business-event-form.component.css']
})
export class UpdateBusinessEventFormComponent implements OnInit {

  eventUpdateBusiness: EventUpdateBusiness;
  eventId = this.businessUserService.eventId;
  title: string;
  location: string;
  timeOfEvent: string;
  dateOfEvent: string;
  description: string;
  businessMessage: string;

  constructor(private businessUserService: BusinessUserService, private router: Router, private eventService: EventService) { }

  ngOnInit() {
  }

  onUpdate() {
    // Passing to server
    this.eventUpdateBusiness = new EventUpdateBusiness(this.eventId, this.title, this.location, this.timeOfEvent, this.dateOfEvent,
      this.description, this.businessMessage);
    console.log(this.eventUpdateBusiness);
    // tslint:disable-next-line: max-line-length
    this.eventService.updateEvent('BusinessUser/BusinessUserEventManager/BusinessUserUpdateBusinessEvent', this.eventUpdateBusiness);

     // TODO need to fix navigating before loading all events
    this.router.navigate(['BusinessUser/BusinessUserEventManager']);

    }

}
