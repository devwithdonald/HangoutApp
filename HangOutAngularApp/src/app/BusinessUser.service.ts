import { Injectable } from '@angular/core';
import { BusinessUser } from 'src/app/BusinessUser';
import { UserDTO } from './user-dto';
// import { HttpClient } from '@angular/common/http';
@Injectable({providedIn: 'root'})
// tslint:disable-next-line: no-unused-expression
export class BusinessUserService {
    constructor() {}

    businessUser: BusinessUser;

    addBusinessUser(userDTO: UserDTO) {
        this.businessUser = new BusinessUser(userDTO.userId, userDTO.username,
            userDTO.password, userDTO.businessName, userDTO.location);
        console.log('business user added to service');
        console.log(this.businessUser);
    }
}
