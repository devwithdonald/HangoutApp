import { User } from './User';
import { BusinessMessage } from './business-message';

export class Event {
    eventId: number;
    user: User;
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    timePosted: string;
    description: string;
    onTimeline: boolean;
    businessMessage: BusinessMessage;

    constructor(eventId: number, user: User, title: string, location: string, timeOfEvent: string, dateOfEvent: string,
        timePosted: string, description: string, onTimeline: boolean, businessMessage: BusinessMessage ) {
            this.eventId = eventId;
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.timePosted = timePosted;
            this.description = description;
            this.onTimeline = onTimeline;
            this.businessMessage = businessMessage;
        }
}
