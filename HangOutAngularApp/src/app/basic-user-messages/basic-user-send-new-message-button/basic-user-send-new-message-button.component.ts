import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-basic-user-send-new-message-button',
  templateUrl: './basic-user-send-new-message-button.component.html',
  styleUrls: ['./basic-user-send-new-message-button.component.css']
})
export class BasicUserSendNewMessageButtonComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  sendNewMessageRedirect() {
    this.router.navigate(['/BasicUser/Messages/SendNewMessage']);
  }
}
