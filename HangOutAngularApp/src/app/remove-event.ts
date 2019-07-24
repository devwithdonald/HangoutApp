import { LoggedInUser } from './logged-in-user';

export class RemoveEvent {

    eventId: number;
    user: LoggedInUser;

    constructor(eventId: number, user: LoggedInUser) {
            this.eventId = eventId;
            this.user = user;
        }
}
