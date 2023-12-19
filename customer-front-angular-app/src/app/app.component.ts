import {Component, OnInit} from '@angular/core';
import {SecurityService} from "./services/security.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'customer-front-angular-app';
  constructor(public securityService : SecurityService) {
  }
  ngOnInit() {
    console.log(this.securityService.profile)
  }

  async login(){
    await this.securityService.kcService.login({
      redirectUri : window.location.origin
    })
  }
  onLogout() {
    this.securityService.kcService.logout(window.location.origin);
  }
  account() {
    window.location.href="http://localhost:8080/realms/ebank-realm/account/#/personal-info";
  }
}
