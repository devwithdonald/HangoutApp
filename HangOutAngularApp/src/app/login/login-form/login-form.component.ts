import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient} from '@angular/common/http';
import { UserService } from 'src/app/user.service';
import { User } from 'src/app/User';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  
  //loggedInUser: UserDTO;
  user: User;
  username: string;
  password: string;

  constructor(private router: Router, private http: HttpClient, private userService: UserService) { }

  ngOnInit() {
  }

  onLogin() {
    console.log('login button clicked');
    console.log(this.username);
    console.log(this.password);
    //populate user
    this.user = new User(this.username, this.password);
    // pass login and username data
    this.userService.postLogin('login', this.user);

  }

  onRegister() {
    // TODO information needs to be sent to the database
    console.log('register button clicked');
    this.router.navigate(['/register']);
  }

}
