import { Injectable } from '@angular/core';
import { BusinessEmployeeUser } from './business-employee-user';
import { UserDTO } from './user-dto';

@Injectable({
  providedIn: 'root'
})
export class BusinessEmployeeUserService {
  businessEmployeeUser: BusinessEmployeeUser;

  constructor() { }

  addBusinessEmployeeUser(userDTO: UserDTO) {
    // const businessEmployeeUser = new BusinessEmployeeUser(userDTO.userId);
    this.businessEmployeeUser.userId = userDTO.userId;
    this.businessEmployeeUser.username = userDTO.username;
    this.businessEmployeeUser.password = userDTO.password;
    this.businessEmployeeUser.role = userDTO.role;
    this.businessEmployeeUser.businessUser = userDTO.businessUser;
  }
}
