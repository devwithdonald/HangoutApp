
export class BasicUser {
   userId: number;
   username: string;
   password: string;
   firstName: string;
   lastName: string;

   constructor(userId: number, username: string, password: string, firstName: string,  lastName: string) {
      this.userId = userId;
      this.username = username;
      this.password = password;
      this.firstName = firstName;
      this.lastName = lastName;
  }
}



