import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  username: string;
  password: string;

  constructor(private router: Router, private http: HttpClient) { }

  ngOnInit() {
  }

  onLogin() {
    console.log('login button clicked');
    console.log(this.username);
    console.log(this.password);
    // pass login and username data

    this.http.post('http://localhost:8080/HangoutApp/login', 
    {"username" : "test_user1", "password" : "user1"}, ).subscribe(
        responseData =>  {
          console.log(responseData);
        }
    );

  }

  onRegister() {
    // TODO information needs to be sent to the database
    console.log('register button clicked');
    this.router.navigate(['/register']);
  }

}
