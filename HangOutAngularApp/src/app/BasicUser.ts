import { User } from 'src/app/User';

export class BasicUser{
    user: User;
    firstName: string;
    lastName: string;
    constructor(fName: string, lname: string, pass: string, use: string) {
        this.firstName = fName;
        this.lastName = lname;
        this.user = new User(use, pass, 'BasicUser');
    }
    
}

