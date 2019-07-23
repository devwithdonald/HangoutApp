import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './User';
import { BasicUserService } from './BasicUser.service';
import { UserDTO } from './user-dto';
import { BusinessUserService } from './BusinessUser.service';
import { BusinessEmployeeUserService } from './business-employee-user.service';
import { Router } from '@angular/router';
import { LoggedInUserService } from './logged-in-user.service';
import { LoggedInUser } from './logged-in-user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  userDTO: UserDTO;
  user: User;
 
  constructor(private router: Router, private http: HttpClient, private basicUserService: BasicUserService, 
              private businessUserService: BusinessUserService, private businessEmployeeUserService: BusinessEmployeeUserService, 
              private loggedInUserService: LoggedInUserService) { }

  url = 'http://localhost:8080/HangoutApp/';
  

  // url -> 'login'
  postLogin(urlEnd: string, user: User) {
    this.http.post(this.url + urlEnd, user).subscribe(
        (responseUser: LoggedInUser) =>  {
          console.log('--- server sent back ---');
          console.log(responseUser);
          this.loggedInUserService.loggedInUser = responseUser;
          this.checkUser(responseUser);
        }
    );
  }

  checkUser(responseUser) {
    // if object is empty
    // if (Object.entries(responseUser).length === 0) {
    //   console.log('object is empty');
    //   return;
    // }

    if (responseUser === null) {
      console.log('object is empty');
      return;
    }

    // populate the userDTO
    this.userDTO = responseUser;

    if (this.userDTO.role.roleType === 'BasicUser') {
      console.log('basic user passed');
      this.basicUserService.addBasicUser(this.userDTO);
      // navigate
      this.router.navigate(['/BasicUser/Homepage']);

    } else if (this.userDTO.role.roleType === 'Business') {
      console.log('business user passed');
      this.businessUserService.addBusinessUser(this.userDTO);
      // navigate
      this.router.navigate(['BusinessUser/HomePage']);
    } else if (this.userDTO.role.roleType === 'BusinessEmployee') {
      console.log('business employee user passed');
      this.businessEmployeeUserService.addBusinessEmployeeUser(this.userDTO);
      this.router.navigate(['/BusinessEmployeeUser/Homepage']);
    }

  }
}
