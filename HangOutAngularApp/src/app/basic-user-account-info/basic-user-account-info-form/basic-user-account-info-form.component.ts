import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-basic-user-account-info-form',
  templateUrl: './basic-user-account-info-form.component.html',
  styleUrls: ['./basic-user-account-info-form.component.css']
})
export class BasicUserAccountInfoFormComponent implements OnInit {

  basicUserUsername: string;
  basicUserPassword: string;
  basicUserFirstName: string;
  basicUserLastName: string;

  constructor(private router: Router) { }

  ngOnInit() {
    // on load
    console.log('get user info logic here');
  }

  // functionality for the edit button needs to be input
  onEdit() {
    // redirect to new page
    this.router.navigate(['BasicUser/ViewAccountInfo/EditAccountInfo']);
  }
}
