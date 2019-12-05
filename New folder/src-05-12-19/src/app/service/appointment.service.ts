import { Doctor } from 'src/app/model/doctor_model';
import { Appointment } from './../model/appointment_model';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {

  redirectUrl = '/';
  loggedIn: boolean = false;
  name: string;
  validCredentials: boolean = false;
  baseUrl = environment.baseUrl;


  private bookAppointmentUrl = this.baseUrl + '/appointment/add';
  private getAppointmentsPatientUrl = this.baseUrl + '/appointment/getAll/';
  private getPatientsDoctorsUrl = this.baseUrl + '/doctors/getPatientsDoctor/';
  private getAppByDocUrl = this.baseUrl + '/appointment/getByDoctor/';


  authCredentials = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Basic ' + btoa('admin:admin')
    })
  };

  constructor(public router: Router, private http: HttpClient) { }

  bookByAgent(appointment: Appointment) {
    return this.http.post(this.bookAppointmentUrl, appointment, this.authCredentials);
  }

  bookWithoutAgent(appointment: Appointment) {
    return this.http.post(this.bookAppointmentUrl, appointment, this.authCredentials);
  }

  getPatientsDoctor(patientId: number) {
    return this.http.get(this.getAppointmentsPatientUrl + patientId, this.authCredentials);
  }
  getAppointmenstByDoctor(doctor: Doctor) {
    return this.http.post(this.getAppByDocUrl, doctor, this.authCredentials);
  }

}
