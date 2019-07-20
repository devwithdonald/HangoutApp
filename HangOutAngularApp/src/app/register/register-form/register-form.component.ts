import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BusinessUserService } from 'src/app/BusinessUser.service';
import { BasicUserService } from 'src/app/BasicUser.service';
import { UserDTO } from 'src/app/user-dto';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Role } from 'src/app/Role';

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

  constructor(private router: Router, private basicUserService: BasicUserService, private businessService: BusinessUserService, private http: HttpClient) { }

  ngOnInit() {
  }


  onBasicUserRegistration() {
    console.log('onBasicUserRegistration clicked');
    console.log(`username: ${this.username}`);
    console.log(`password: ${this.password}`);
    console.log(`firstName: ${this.firstName}`);
    console.log(`lastName: ${this.lastName}`);
    const user = new UserDTO();
    const role = new Role(1, 'BasicUser');
    user.username = this.username;
    user.password = this.password;
    user.firstName = this.firstName;
    user.lastName = this.lastName;
    user.role = role;
    console.log(user);
    const url = 'http://localhost:8082/HangoutApp/register';
    this.router.navigate(['/login']);
    // console.log('--after navigate--')
    // console.log(user);
    // console.log('--JSON--');
    // console.log(JSON.stringify(user));
    // console.log('--No JSON--');
    // console.log(this.basicUserService.addBasicUser(user));
    return this.http.post(url, user).subscribe(Boolean);
    // TODO need to alert user that registration was successful
    // TODO if successful registration then redirect

  }

  onBusinessUserRegistration() {

    console.log('onBusinessUserRegistration clicked');
    console.log(`username: ${this.username}`);
    console.log(`password: ${this.password}`);
    console.log(`businessName: ${this.businessName}`);
    console.log(`businessLocation: ${this.businessLocation}`);
    const businessUser = new UserDTO();
    const role = new Role(2, 'BusinessUser');
    businessUser.username = this.username;
    businessUser.password = this.password;
    businessUser.businessName = this.businessName;
    businessUser.location = this.businessLocation;
    businessUser.role = role;
    console.log(businessUser);
    const url = 'http://localhost:8082/HangoutApp/register';
    this.router.navigate(['/login']);
    return this.http.post(url, JSON.stringify(this.businessService.addBusinessUser(businessUser))).subscribe();
    // TODO need to alert user that registration was successful
    // TODO if successful registration then redirect

  }

}
