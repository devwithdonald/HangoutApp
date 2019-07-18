import { Injectable, Inject } from '@angular/core';
import { BusinessUser } from 'src/app/BusinessUser';
import { HttpClient } from '@angular/common/http';
@Injectable()
// tslint:disable-next-line: no-unused-expression
export class BusinessUserService {
    http: HttpClient;
    constructor(
        public businessUser: BusinessUser,
        @Inject('username') public username: string,

        @Inject('password') public password: string,

        @Inject('businessName') public name: string,

        @Inject('businessLocation') public location: string 

    ) {
        businessUser.name = name;
        businessUser.location = location;
        businessUser.user.password = password;
        businessUser.user.role = 2;
        businessUser.user.username = username;
    }
    addBusinessUser(businessUser: BusinessUser) {
        console.log(businessUser);
        console.log('hello addbusinessuser');
        //return this.http.post();
    }
}
 
