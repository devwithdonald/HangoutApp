import { Injectable } from '@angular/core';
import { LoggedInUser } from './logged-in-user';

@Injectable({
  providedIn: 'root'
})
export class LoggedInUserService {

  loggedInUser: LoggedInUser;

  constructor() { }

}
