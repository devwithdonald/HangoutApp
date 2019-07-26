import { Role } from './Role';

export class BasicUserFriend {

    userId: number;
    username: string;
    password: string;
    role: Role;
    firstName: string;
    lastName: string;
 
    constructor(userId: number, username: string, password: string, role: Role, firstName: string,  lastName: string) {
       this.userId = userId;
       this.username = username;
       this.password = password;
       this.role = role;
       this.firstName = firstName;
       this.lastName = lastName;
   }
}
