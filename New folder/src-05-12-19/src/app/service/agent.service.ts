import { Agents } from 'src/app/model/agents_model';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AgentsService {
  redirectUrl = '/';
  loggedIn: boolean = false;
  name: string;
  validCredentials: boolean = false;
  baseUrl = environment.baseUrl;
  private getAllAgentsUrl = this.baseUrl + '/agents/getAll';
  private getAgentUrl = this.baseUrl + '/agents/get/';
  private addAgentUrl = this.baseUrl + '/users/agent';

  authCredentials = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Basic ' + btoa('admin:admin')
    })
  };

  constructor(public router: Router, private http: HttpClient) { }

  getAllAgentUrl() {
    return this.http.get(this.getAllAgentsUrl, this.authCredentials);
  }

  updatePatientApproval(agent: Agents) {

    return this.http.put<Agents>(this.baseUrl + '/agents/editApproval', agent, this.authCredentials);
  }

  addAgent(agent: Agents) {
    return this.http.post(this.addAgentUrl, agent, this.authCredentials)
  }

  getAgent(id){
    return this.http.get(this.getAgentUrl + id, this.authCredentials);
  }

  


}