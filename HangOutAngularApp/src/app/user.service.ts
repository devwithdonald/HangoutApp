import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './User';
import { BasicUserService } from './BasicUser.service';
import { UserDTO } from './user-dto';
import { BusinessUserService } from './BusinessUser.service';
import { BusinessEmployeeUserService } from './business-employee-user.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  userDTO: UserDTO;
  user: User;
 
  constructor(private http: HttpClient, private basicUserService: BasicUserService, 
    private businessUserService: BusinessUserService, private businessEmployeeUserService: BusinessEmployeeUserService) { }

  url = 'http://localhost:8080/HangoutApp/';

  // url -> 'login'
  postLogin(urlEnd: string, user: User) {
    this.http.post(this.url + urlEnd, user).subscribe(
        responseUser =>  {
          console.log('--- server sent back ---');
          console.log(responseUser);
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
    } else if (this.userDTO.role.roleType === 'Business') {
      console.log('business user passed');
      this.businessUserService.addBusinessUser(this.userDTO);
    } else if (this.userDTO.role.roleType === 'BusinessEmployee') {
      console.log('business employee user passed');
      this.businessEmployeeUserService.addBusinessEmployeeUser(this.userDTO);
    }
  }
}
