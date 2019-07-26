import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-basic-user-friends',
  templateUrl: './basic-user-friends.component.html',
  styleUrls: ['./basic-user-friends.component.css']
})
export class BasicUserFriendsComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  onAddFriend() {
    this.router.navigate(['/BasicUser/Friends/AddFriend']);
  }

}
