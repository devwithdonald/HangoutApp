import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { EventAdd } from './event-add';
import { EventUpdateBusiness } from './event-update-business';


@Injectable({
  providedIn: 'root'
})
export class EventService {




  constructor(private router: Router, private http: HttpClient) { }

  url = 'http://localhost:8080/HangoutApp/';

  postEvent(urlEnd: string, event: EventAdd) {
    this.http.post(this.url + urlEnd, event).subscribe(
      (response: boolean) => {
        console.log('response from server: ' + response);
        return response;
      }
    );

  }

  updateEvent(urlEnd: string, event: EventUpdateBusiness) {
    this.http.post(this.url + urlEnd, event).subscribe(
      (response: boolean) => {
        console.log('response from server: ' + response);
        return response;
      }
    );

  }

}
