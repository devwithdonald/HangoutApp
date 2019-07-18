import { Injectable, Inject } from '@angular/core';
import { BasicUser } from 'src/app/BasicUser';
import { HttpClient } from '@angular/common/http';
@Injectable()
// tslint:disable-next-line: no-unused-expression
export class BasicUserService {
    http: HttpClient;
    constructor(
        public basicUser: BasicUser,
        @Inject('username') public username: string,

        @Inject('password') public password: string,

        @Inject('firstName') public firstName: string,

        @Inject('lastName') public lastName: string
    ){
        basicUser.firstName = firstName;
        basicUser.lastName = lastName;
        basicUser.user.username = username;
        basicUser.user.password = password;
        basicUser.user.role = 1;
    }
    addBasicUser(basicUser: BasicUser){
        console.log('hello addbasicuser');
        console.log(basicUser);
        //return this.http.post();

    }
}
