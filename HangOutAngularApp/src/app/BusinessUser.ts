
export class BusinessUser {
    userId: number;
    username: string;
    password: string;
    businessName: string;
    location: string;

    constructor(userId: number, username: string, password: string, businessName: string,  location: string) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.businessName = businessName;
        this.location = location;
    }
}