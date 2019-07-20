import { Role } from './Role';
import { BusinessUser } from './BusinessUser';

export class UserDTO {
    userId: number;
    username: string;
    password: string;
    role: Role;
    businessName: string;
    location: string;
    firstName: string;
    lastName: string;
    businessUser: BusinessUser;
}
