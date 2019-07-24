import { Event } from 'src/app/event';
import { BasicUser } from 'src/app/BasicUser';

export class RSVP {
    status: string;
    eventId: number;
    // Event: Event;
    // BasicUser: BasicUser;

    constructor(status: string, eventId: number) {
        this.status = status;
        this.eventId = eventId;
    }

}
