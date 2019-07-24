import { Component } from '@angular/core';
import { flatten } from '@angular/compiler';
import { LoggedInUser } from './logged-in-user';
import { LoggedInUserService } from './logged-in-user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'HangOutAngularApp';
}
