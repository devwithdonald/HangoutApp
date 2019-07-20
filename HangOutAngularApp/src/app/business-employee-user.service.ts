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
    this.businessEmployeeUser = new BusinessEmployeeUser(userDTO.userId, userDTO.username,
      userDTO.password, userDTO.role, userDTO.businessUser);
    console.log('business user employee added to service');
    console.log(this.businessEmployeeUser);
  }
}
