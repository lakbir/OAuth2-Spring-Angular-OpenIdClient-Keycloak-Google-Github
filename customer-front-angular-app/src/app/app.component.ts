import {Component, OnInit} from '@angular/core';
import {SecurityService} from "./services/security.service";
import {KeycloakService} from "keycloak-angular";
import {KeycloakProfile} from "keycloak-js";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'customer-front-angular-app';
  public profile? : KeycloakProfile;
  constructor(public keycloakService: KeycloakService) {
  }
  ngOnInit() {
    if(this.keycloakService.isLoggedIn()){
      this.keycloakService.loadUserProfile().then(profile=>{
        this.profile=profile;
      });
    }
  }

  async login(){
    await this.keycloakService.login({
      redirectUri : window.location.origin
    })
  }
  onLogout() {
    this.keycloakService.logout(window.location.origin);
  }
  account() {
    window.location.href="http://localhost:8080/realms/ebank-realm/account/#/personal-info";
  }
}
