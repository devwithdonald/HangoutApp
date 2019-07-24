import { LoggedInUser } from './logged-in-user';

export class EventUpdate {
    eventId: number;
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    description: string;
    user: LoggedInUser;

    constructor(eventId: number, title: string, location: string, timeOfEvent: string, 
        dateOfEvent: string, description: string, user: LoggedInUser) {
            this.eventId = eventId;
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.description = description;
            this.user = user;
        }
}
