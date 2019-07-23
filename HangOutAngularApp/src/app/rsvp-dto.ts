import { Event } from 'src/app/event';
import { BasicUser } from 'src/app/BasicUser';

export class RSVP {
    Status: string;
    EventId: number;
    Event: Event;
    BasicUser: BasicUser;

    constructor(status: string, eventId: number) {
        this.Status = status;
        this.EventId = eventId;
    }

}
