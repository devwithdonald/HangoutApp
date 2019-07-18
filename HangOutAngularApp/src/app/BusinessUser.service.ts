import { Injectable, Inject } from '@angular/core';
import { BusinessUser } from 'src/app/BusinessUser';
import { HttpClient } from '@angular/common/http';
@Injectable({providedIn: 'root'})
// tslint:disable-next-line: no-unused-expression
export class BusinessUserService {
    constructor() {

    }
    businessUser: BusinessUser;

    addBusinessUser(username: string, password: string, businessName: string, businessLocation: string) {
        console.log('hello addbusinessuser');
        console.log(username, password, businessLocation, businessName);
    }
}
