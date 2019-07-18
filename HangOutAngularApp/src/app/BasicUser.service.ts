import { Injectable, Inject } from '@angular/core';
import { BasicUser } from 'src/app/BasicUser';
import { HttpClient } from '@angular/common/http';
@Injectable({providedIn: 'root'})
// tslint:disable-next-line: no-unused-expression
export class BasicUserService {
    constructor() {
    }

    basicUser: BasicUser;

    addBasicUser(username: string, password: string, firstName: string, lastName: string) {
        console.log('hello addbasicuser');
        console.log(username, password, firstName, lastName);
        //return this.http.post();

    }
}
