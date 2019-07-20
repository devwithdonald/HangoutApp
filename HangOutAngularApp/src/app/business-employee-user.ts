import { Role } from './Role';
import { BusinessUser } from './BusinessUser';

export class BusinessEmployeeUser {
    userId: number;
    username: string;
    password: string;
    role: Role;
    businessUser: BusinessUser;
}
