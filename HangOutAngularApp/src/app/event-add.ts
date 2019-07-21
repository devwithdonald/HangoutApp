export class EventAdd {
    title: string;
    location: string;
    timeOfEvent: string;
    dateOfEvent: string;
    description: string;

    constructor(title: string, location: string, timeOfEvent: string, 
        dateOfEvent: string, description: string) {
            this.title = title;
            this.location = location;
            this.timeOfEvent = timeOfEvent;
            this.dateOfEvent = dateOfEvent;
            this.description = description;
        }
}
