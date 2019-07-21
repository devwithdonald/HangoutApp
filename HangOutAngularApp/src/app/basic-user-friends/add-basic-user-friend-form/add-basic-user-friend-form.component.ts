import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-add-basic-user-friend-form',
  templateUrl: './add-basic-user-friend-form.component.html',
  styleUrls: ['./add-basic-user-friend-form.component.css']
})
export class AddBasicUserFriendFormComponent implements OnInit {

  friendName: string;

  constructor() { }

  ngOnInit() {
  }

  onAddFriend() {

    console.log('Adding ' + this.friendName + 'as a friend');
  }
}
