import { LoggedInUser } from './logged-in-user';

export class EventUpdateBusiness {
    eventId: number;
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    description: string;
    businessMessage: string;
    user: LoggedInUser;

    constructor(eventId: number, title: string, location: string, timeOfEvent: string, 
        dateOfEvent: string, description: string, businessMessage: string, user: LoggedInUser) {
            this.eventId = eventId;
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.description = description;
            this.businessMessage = businessMessage;
            this.user = user;
        }
}
