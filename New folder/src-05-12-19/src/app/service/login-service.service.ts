import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {
 
  redirectUrl = '/';
  loggedIn: boolean = false;
  name: string;
  validCredentials: boolean = false;

  loggedInUserId = 0;

  authCredentials = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Basic ' + btoa('admin:admin')
    })
  };
  




  constructor(public router: Router, private http: HttpClient) { }

  baseUrl = environment.baseUrl;
  private authenticationApiUrl = this.baseUrl + '/authenticate';
  getUserIdUrl = this.baseUrl + '/users/';  

  private token: string;


  authenticate(user: string, password: string): Observable<any> {
    let credentials = btoa(user + ':' + password);
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', 'Basic ' + credentials);
    return this.http.get(this.authenticationApiUrl, { headers })
  }

  /*public setToken(token: string) {
    this.token = token;
  }
  public getToken() {
    return this.token;
  }*/

 
  
 
 /*
  logout() {
    this.loggedInUser = null;
    this.foodService.isAdmin = false;
    this.loggedIn = false;
    this.foodService.isLoggedIn = false;
    this.foodService.clickedOnAdd = false;
    this.foodService.addedToCart = false;
    this.router.navigate(['login']);
  }*/

  getUserId(username){
    return this.http.get(this.getUserIdUrl+username,this.authCredentials);
  }
  
}
