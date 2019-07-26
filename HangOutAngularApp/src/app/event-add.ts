import { User } from './User';
import { LoggedInUser } from './logged-in-user';

export class EventAdd {
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    description: string;
    user: LoggedInUser;

    constructor(title: string, location: string, timeOfEvent: string, 
        dateOfEvent: string, description: string, user: LoggedInUser) {
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.description = description;
            this.user = user;
        }
}
