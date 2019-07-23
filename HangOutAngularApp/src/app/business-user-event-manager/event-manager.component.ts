import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { BusinessUser } from '../BusinessUser';
import { BusinessUserService } from '../BusinessUser.service';

@Component({
  selector: 'app-event-manager',
  templateUrl: './event-manager.component.html',
  styleUrls: ['./event-manager.component.css']
})
export class EventManagerComponent implements OnInit {

  events: Event[];
  eventIdUpdate: number;
  constructor(private businessUserService: BusinessUserService, private http: HttpClient, private router: Router) { }

  ngOnInit() {
    this.http.get('http://localhost:8080/HangoutApp/BusinessUser/BusinessUserEventManager')
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

}
