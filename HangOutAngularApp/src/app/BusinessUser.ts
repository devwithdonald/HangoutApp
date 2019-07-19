import { User } from 'src/app/User';
export class BusinessUser{
    name: string;
    location: string;
    user: User;
    
    constructor(name: string, location: string, username: string, password: string, role: string) {
        this.name=name;
        this.location=location;
        this.user.password=password;
        this.user.role.roleType=role;
        this.user.username=username;
    }

}