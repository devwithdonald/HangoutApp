import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-edit-basic-user-friend-form',
  templateUrl: './edit-basic-user-friend-form.component.html',
  styleUrls: ['./edit-basic-user-friend-form.component.css']
})
export class EditBasicUserFriendFormComponent implements OnInit {

  friendName: string;

  constructor( private http : HttpClient) { }

  ngOnInit() {
  }

  onAddFriend() {
    const url = 'http://localhost:8080/HangoutApp/BasicUser/Friends';
    console.log('Adding ' + this.friendName + 'as a friend');
    return this.http.post(url, this.friendName);
  }

  onRemoveFriend() {

    const url = 'http://localhost:8080/HangoutApp/BasicUser/Friends';
    console.log('Removing ' + this.friendName + 'as a friend');
    return this.http.post(url, this.friendName);
  }
}
