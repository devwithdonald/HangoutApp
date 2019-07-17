import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-basic-user-send-new-message-form',
  templateUrl: './basic-user-send-new-message-form.component.html',
  styleUrls: ['./basic-user-send-new-message-form.component.css']
})
export class BasicUserSendNewMessageFormComponent implements OnInit {

  private receiver: string;
  private message: string;

  constructor() { }

  ngOnInit() {
  }

  onSendMessage() {
    // TODO should check if receiver exists via a service!
    console.log(`receiver: ${this.receiver}`);

    console.log(`message: ${this.message}`);
  }

}
