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

@Component({
  selector: 'app-event-manager',
  templateUrl: './event-manager.component.html',
  styleUrls: ['./event-manager.component.css']
})
export class EventManagerComponent implements OnInit {

  events: Event[];
  eventIdUpdate: number;
  eventId: number;
  removeEvent: EventUpdateBusiness;

  user: LoggedInUser;

  constructor(private businessUserService: BusinessUserService, private http: HttpClient, private router: Router,
              private loggedInUserService: LoggedInUserService) { }



  ngOnInit() {
    //Sconsole.log(this.loggedInUserService.loggedInUser);
    // this.user = new LoggedInUser(this.loggedInUserService.loggedInUser.userId,
    //   this.loggedInUserService.loggedInUser.username, this.loggedInUserService.loggedInUser.password,
    //   this.loggedInUserService.loggedInUser.role);
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

    this.removeEvent.user = this.loggedInUserService.loggedInUser;
    this.removeEvent.eventId = this.eventId;
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
