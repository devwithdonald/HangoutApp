import { Role } from './Role';
import { BusinessUser } from './BusinessUser';

export class BusinessEmployeeUser {
    userId: number;
    username: string;
    password: string;
    role: Role;
    businessUser: BusinessUser;

    constructor(userId: number, username: string, password: string, role: Role, businessUser: BusinessUser) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.businessUser = businessUser;
    }
}
