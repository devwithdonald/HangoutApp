import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { BusinessUser } from '../BusinessUser';
import { BusinessUserService } from '../BusinessUser.service';
import { LoggedInUserService } from '../logged-in-user.service';
import { EventAddBusiness } from '../event-add-business';
import { EventUpdateBusiness } from '../event-update-business';
import { User } from '../User';
import { LoggedInUser } from '../logged-in-user';
import { RemoveEvent } from '../remove-event';

@Component({
  selector: 'app-event-manager',
  templateUrl: './event-manager.component.html',
  styleUrls: ['./event-manager.component.css']
})
export class EventManagerComponent implements OnInit {

  events: Event[];
  eventIdUpdate: number;
  eventId: number;
  removeEvent: RemoveEvent;

  user: LoggedInUser;

  constructor(private businessUserService: BusinessUserService, private http: HttpClient, private router: Router,
              private loggedInUserService: LoggedInUserService) { }



  ngOnInit() {
    this.http.post('http://localhost:8080/HangoutApp/BusinessUser/BusinessUserEventManager', this.loggedInUserService.loggedInUser)
    .subscribe(
      (response: Event[]) => {
        console.log('response from server');
        console.log(response);
        this.events = response;
        console.log('-- local events array --');
        console.log(this.events);
      }
    );
  }

  onAdd() {
    this.router.navigate(['BusinessUser/BusinessUserEventManager/BusinessUserAddBusinessEvent']);
  }

  onUpdate() {
    this.businessUserService.eventId = this.eventIdUpdate;
    this.router.navigate(['BusinessUser/BusinessUserEventManager/BusinessUserUpdateBusinessEvent']);
  }

  onRemove() {

    this.removeEvent = new RemoveEvent(this.eventId, this.loggedInUserService.loggedInUser);

    this.http.post('http://localhost:8080/HangoutApp/BusinessUser/BusinessUserEventManager/BusinessUserRemoveBusinessEvent', 
    this.removeEvent)
    .subscribe(
      (response: boolean) => {
        console.log('response from server: ' + response);
        return response;
      }
    );

  }

}
