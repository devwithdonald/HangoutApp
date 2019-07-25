import { BasicUserFriend } from './basic-user-friend';
import { Role } from './Role';

export class UserFriends {

    userId: number;
    username: string;
    password: string;
    role: Role;
    friendList: BasicUserFriend[];
    firstName: string;
    lastName: string;



    constructor(userId: number, username: string, password: string, role: Role, friendList: BasicUserFriend[],
                firstName: string, lastName: string) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.friendList = friendList;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
