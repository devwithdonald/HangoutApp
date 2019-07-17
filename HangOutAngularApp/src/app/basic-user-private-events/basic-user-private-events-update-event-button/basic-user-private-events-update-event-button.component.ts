import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-basic-user-private-events-update-event-button',
  templateUrl: './basic-user-private-events-update-event-button.component.html',
  styleUrls: ['./basic-user-private-events-update-event-button.component.css']
})
export class BasicUserPrivateEventsUpdateEventButtonComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
    // TODO onload will need to populate the table
    // will be a get request
  }

  onUpdateEvent() {
    // redirect to update events page for the basic user
    this.router.navigate(['/BasicUser/PrivateEvents/UpdateEvent']);
  }
}
