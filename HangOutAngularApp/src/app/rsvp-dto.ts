import { Event } from 'src/app/event';
import { BasicUser } from 'src/app/BasicUser';
import { User } from 'src/app/user';
export class RSVP {
    status: string;
    eventId: number;
    // Event: Event;
    user1: User;

    constructor(status: string, eventId: number, basicUser: User) {
        this.status = status;
        this.eventId = eventId;
        this.user1 = basicUser;
    }

}
