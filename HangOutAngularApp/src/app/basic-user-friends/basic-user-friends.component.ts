import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { UserDTO } from "src/app/user-dto";
import { Observable } from 'rxjs';

@Component({
  selector: 'app-basic-user-friends',
  templateUrl: './basic-user-friends.component.html',
  styleUrls: ['./basic-user-friends.component.css']
})
export class FriendsComponent implements OnInit {

  users: UserDTO[];
  userDTOObservable: Observable<UserDTO[]>;

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.httpClient.get('localhost:8080/HangoutApp/BasicUser/Friends')
    .subscribe((response: UserDTO[]) => {
      console.log('response from server');
      console.log(response);
      this.users = response;
    })
    }
}

