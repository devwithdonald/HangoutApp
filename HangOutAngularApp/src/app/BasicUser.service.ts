import { Injectable } from '@angular/core';
import { BasicUser } from 'src/app/BasicUser';
import { UserDTO } from './user-dto';

@Injectable({providedIn: 'root'})
// tslint:disable-next-line: no-unused-expression
export class BasicUserService {

    basicUser: BasicUser;

    constructor() {
    }

    addBasicUser(userDTO: UserDTO) {
       this.basicUser = new BasicUser(userDTO.userId, userDTO.username,
        userDTO.password, userDTO.firstName, userDTO.lastName);
       console.log('basic user added to service');
      // console.log(this.basicUser);
       return this.basicUser;
    }
}

