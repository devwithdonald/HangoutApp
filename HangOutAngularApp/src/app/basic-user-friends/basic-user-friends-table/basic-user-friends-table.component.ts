import { Component, OnInit } from '@angular/core';
import { LoggedInUserService } from 'src/app/logged-in-user.service';
import { HttpClient } from '@angular/common/http';
import { UserFriends } from 'src/app/user-friends';

@Component({
  selector: 'app-basic-user-friends-table',
  templateUrl: './basic-user-friends-table.component.html',
  styleUrls: ['./basic-user-friends-table.component.css']
})
export class BasicUserFriendsTableComponent implements OnInit {

  userFriend: UserFriends;


  constructor(private http: HttpClient, private loggedInUserService: LoggedInUserService) { }

  ngOnInit() {
    this.http.post('http://localhost:8080/HangoutApp/BasicUser/Friends',  this.loggedInUserService.loggedInUser.userId)
    .subscribe(
      //response => {
       (response: UserFriends) => {
        console.log('response from server FRIENDS!!!!!!!');
        console.log(response);
        this.userFriend = response;
        console.log('-- FRIENDS REPONSE!!!! --');
        console.log(this.userFriend);
      }
    );

  }

}
