import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BusinessUserService } from 'src/app/BusinessUser.service';
import { BasicUserService } from 'src/app/BasicUser.service';

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

  constructor(private router: Router, private basicUserService: BasicUserService, private businessService: BusinessUserService) { }

  ngOnInit() {
  }

  onBasicUserRegistration() {
    console.log('onBasicUserRegistration clicked');
    console.log(`username: ${this.username}`);
    console.log(`password: ${this.password}`);
    console.log(`firstName: ${this.firstName}`);
    console.log(`lastName: ${this.lastName}`);
    this.basicUserService.addBasicUser(this.basicUserService.basicUser);
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
    this.businessService.addBusinessUser(this.businessService.businessUser);
    // TODO need to alert user that registration was successful
    // TODO if successful registration then redirect
    this.router.navigate(['']);
  }
  

}
