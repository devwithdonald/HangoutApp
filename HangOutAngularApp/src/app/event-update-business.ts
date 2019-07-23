export class EventUpdateBusiness {
    eventId: number;
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    description: string;
    businessMessage: string;

    constructor(eventId: number, title: string, location: string, timeOfEvent: string, 
        dateOfEvent: string, description: string, businessMessage: string) {
            this.eventId = eventId;
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.description = description;
            this.businessMessage = businessMessage;
        }
}
