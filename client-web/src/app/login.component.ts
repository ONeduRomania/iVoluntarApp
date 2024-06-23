// login.component.ts
import { Component } from '@angular/core';
import { UserService } from './user.service';

@Component({
  selector: 'app-login',
  template: `
    <div>
      <label>Username: </label>
      <input type="text" [(ngModel)]="username">
    </div>
    <div>
      <label>Password: </label>
      <input type="password" [(ngModel)]="password">
    </div>
    <button (click)="login()">Login</button>
  `
})
export class LoginComponent {

  username: string;
  password: string;

  constructor(private userService: UserService) {}

  login() {
    this.userService.login(this.username, this.password)
      .subscribe(
        () => {
          console.log('Login successful');
          // poți adăuga navigare către altă pagină aici
        },
        error => {
          console.error('Login failed', error);
          // poți gestiona eroarea în mod corespunzător aici
        }
      );
  }
}
