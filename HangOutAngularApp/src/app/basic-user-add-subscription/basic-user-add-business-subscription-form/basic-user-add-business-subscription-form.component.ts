import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-basic-user-add-business-subscription-form',
  templateUrl: './basic-user-add-business-subscription-form.component.html',
  styleUrls: ['./basic-user-add-business-subscription-form.component.css']
})
export class BasicUserAddBusinessSubscriptionFormComponent implements OnInit {

  businessId: string;

  constructor() { }

  ngOnInit() {
  }

  onAddSubscription() {
    // post request to spring
    console.log('Business Id: ' + this.businessId);
  }

}
