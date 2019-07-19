import { Injectable, Inject } from '@angular/core';
import { BasicUser } from 'src/app/BasicUser';
import { stringify } from 'querystring';

@Injectable({providedIn: 'root'})
// tslint:disable-next-line: no-unused-expression
export class BasicUserService {
    constructor() {
    }


    addBasicUser(username: string, password: string, firstName: string, lastName: string) {
        console.log('hello addbasicuser');
        console.log(username, password, firstName, lastName);
        const basic = new BasicUser(firstName, lastName, password, username);
        console.log(basic);
        return basic;

    }
}

