import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {

  userChoice = 'Select User Type'; // defualt value
  username: string;
  password: string;
  firstName: string;
  lastName: string;
  businessName: string;
  businessLocation: string;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  onBasicUserRegistration() {
    console.log('onBasicUserRegistration clicked');
    console.log(`username: ${this.username}`);
    console.log(`password: ${this.password}`);
    console.log(`firstName: ${this.firstName}`);
    console.log(`lastName: ${this.lastName}`);
    // TODO need to alert user that registration was successful
    // TODO if successful registration then redirect
    this.router.navigate(['']);
  }

  onBusinessUserRegistration() {
    console.log('onBusinessUserRegistration clicked');
    console.log(`username: ${this.username}`);
    console.log(`password: ${this.password}`);
    console.log(`businessName: ${this.businessName}`);
    console.log(`businessLocation: ${this.businessLocation}`);
    // TODO need to alert user that registration was successful
    // TODO if successful registration then redirect
    this.router.navigate(['']);
  }
  

}
