import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  username: string;
  password: string;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  onLogin() {
    console.log('login button clicked');
    console.log(this.username);
    console.log(this.password);
  }

  onRegister() {
    // TODO information needs to be sent to the database
    console.log('register button clicked');
    this.router.navigate(['/register']);
  }

}
