export class EventUpdate {
    eventId: number;
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    description: string;

    constructor(eventId: number, title: string, location: string, timeOfEvent: string, 
        dateOfEvent: string, description: string) {
            this.eventId = eventId;
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.description = description;
        }
}
