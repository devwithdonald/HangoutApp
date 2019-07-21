import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { EventAdd } from './event-add';

@Injectable({
  providedIn: 'root'
})
export class EventService {

  constructor(private router: Router, private http: HttpClient) { }

  url = 'http://localhost:8080/HangoutApp/';

  postEvent(urlEnd: string, event: EventAdd) {
    this.http.post(this.url + urlEnd, event).subscribe(
      response => {
        console.log('response from server: ' + response);
        this.eventAddCheck(response);
      }
    );
  }

  eventAddCheck(response) {
    if (response) {
      this.router.navigate(['/BasicUser/PrivateEvents']);
    } else {
      alert('Event not added, please try again.');
    }
  }
}
