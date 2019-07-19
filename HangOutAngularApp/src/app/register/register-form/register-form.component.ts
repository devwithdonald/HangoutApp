import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BusinessUserService } from 'src/app/BusinessUser.service';
import { BasicUserService } from 'src/app/BasicUser.service';
import { BasicUser } from 'src/app/BasicUser';
import { BusinessUser } from 'src/app/BusinessUser';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {

  
  userChoice = 'Select User Type'; // defualt value
  url : "http://localhost:8080/HangoutApp/register";
  username: string;
  password: string;
  firstName: string;
  lastName: string;
  businessName: string;
  businessLocation: string;

  constructor(private router: Router, private basicUserService: BasicUserService, private businessService: BusinessUserService, private http: HttpClient) { }

  ngOnInit() {
  }

  onBasicUserRegistration() {
    console.log('onBasicUserRegistration clicked');
    console.log(`username: ${this.username}`);
    console.log(`password: ${this.password}`);
    console.log(`firstName: ${this.firstName}`);
    console.log(`lastName: ${this.lastName}`);
    return this.http.post(this.url, this.basicUserService.addBasicUser(this.username, this.password, this.firstName, this.lastName));
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
    return this.http.post(this.url, this.businessService.addBusinessUser(this.username, this.password, this.businessName, this.businessLocation));
    // TODO need to alert user that registration was successful
    // TODO if successful registration then redirect
    this.router.navigate(['']);
  }
  

}
