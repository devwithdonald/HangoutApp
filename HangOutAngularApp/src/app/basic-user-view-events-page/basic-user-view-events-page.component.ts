import { Component, OnInit } from '@angular/core';
import { EventService } from 'src/app/event.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-basic-user-view-events-page',
  templateUrl: './basic-user-view-events-page.component.html',
  styleUrls: ['./basic-user-view-events-page.component.css']
})
export class BasicUserViewEventsPageComponent implements OnInit {


  events: Event[];
  id: number;

  constructor(private eventService: EventService, private http: HttpClient) { }

  ngOnInit() {
    this.http.get('http://localhost:8080/HangoutApp/BasicUser/Events')
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
