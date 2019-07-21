export class EventAddBusiness {
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    description: string;
    businessMessage: string;

    constructor(title: string, location: string, timeOfEvent: string, 
        dateOfEvent: string, description: string, businessMessage: string) {
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.description = description;
            this.businessMessage = businessMessage;
        }
}
