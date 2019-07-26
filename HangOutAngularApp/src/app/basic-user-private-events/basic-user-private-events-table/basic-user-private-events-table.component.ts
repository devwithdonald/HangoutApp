import { Component, OnInit } from '@angular/core';
import { EventService } from 'src/app/event.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-basic-user-private-events-table',
  templateUrl: './basic-user-private-events-table.component.html',
  styleUrls: ['./basic-user-private-events-table.component.css']
})
export class BasicUserPrivateEventsTableComponent implements OnInit {

  events: Event[];

  constructor(private eventService: EventService, private http: HttpClient) { }

  ngOnInit() {
    this.http.get('http://localhost:8080/HangoutApp/BasicUser/PrivateEvents')
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

}
