import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-basic-user-private-events-add-event-button',
  templateUrl: './basic-user-private-events-add-event-button.component.html',
  styleUrls: ['./basic-user-private-events-add-event-button.component.css']
})
export class BasicUserPrivateEventsAddEventButtonComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  onAddEvent() {
    // redirect to add events page for the basic user
    this.router.navigate(['/BasicUser/PrivateEvents/AddEvent']);
  }

}
