import { Component, OnInit } from '@angular/core';
import { Event } from 'src/app/event';
import { User } from 'src/app/User';
import { UserDTO } from 'src/app/user-dto';
import { NgbTabTitle } from '@ng-bootstrap/ng-bootstrap';
import { Tree } from 'src/app/tree';

@Component({
  selector: 'app-basic-user-private-events-table',
  templateUrl: './basic-user-private-events-table.component.html',
  styleUrls: ['./basic-user-private-events-table.component.css']
})
export class BasicUserPrivateEventsTableComponent implements OnInit {
 
  events = [];
  

  constructor() { }

  ngOnInit() {
  }

}
