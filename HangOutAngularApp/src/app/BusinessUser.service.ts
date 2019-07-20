import { Injectable, Inject } from '@angular/core';
import { BusinessUser } from 'src/app/BusinessUser';
import { UserDTO } from './user-dto';
// import { HttpClient } from '@angular/common/http';
@Injectable({providedIn: 'root'})
// tslint:disable-next-line: no-unused-expression
export class BusinessUserService {
    constructor() {}

    businessUser: BusinessUser;

    addBusinessUser(userDTO: UserDTO) {
        this.businessUser.userId = userDTO.userId;
        this.businessUser.username = userDTO.username;
        this.businessUser.password = userDTO.password;
        this.businessUser.businessName = userDTO.businessName;
        this.businessUser.location = userDTO.location;
    }
}
