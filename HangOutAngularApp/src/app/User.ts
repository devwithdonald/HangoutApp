import { Role } from 'src/app/Role';

export class User {
      role: Role;
    username: string;
    password: string;
  //  id: number;

    constructor(username: string, password: string, role: string) {
        this.username = username;
        this.password = password;
       // this.role = new Role(role);
    }
}

