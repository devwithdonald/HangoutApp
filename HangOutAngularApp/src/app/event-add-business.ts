import { LoggedInUser } from './logged-in-user';

export class EventAddBusiness {
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    description: string;
    businessMessage: string;
    user: LoggedInUser;

    constructor(title: string, location: string, timeOfEvent: string, 
        dateOfEvent: string, description: string, businessMessage: string, user: LoggedInUser) {
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.description = description;
            this.businessMessage = businessMessage;
            this.user = user;
        }
}
