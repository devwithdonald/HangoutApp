import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-subscription-table',
  templateUrl: './subscription-table.component.html',
  styleUrls: ['./subscription-table.component.css']
})
export class SubscriptionTableComponent implements OnInit {

  constructor(private router: Router) { }
    
  onAddSubscription() {

    // redirect to add events page for the basic user
    this.router.navigate(['/BasicUser/Subscriptions/AddSubscription']);
  }
  ngOnInit() {
  }

}
