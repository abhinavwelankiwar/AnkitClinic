import { Medicare } from './../model/medicare_service_model';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Doctor } from '../model/doctor_model';
import { Patient } from '../model/patient_model';


@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  redirectUrl = '/';
  loggedIn: boolean = false;
  name: string;
  validCredentials: boolean = false;
  baseUrl = environment.baseUrl;
  private getAllDoctorsUrl = this.baseUrl + '/doctors/getAll';
  private getDoctorUrl = this.baseUrl + '/doctors/get/';
  private getAllDoctorsByMedicareServiceUrl = this.baseUrl + '/doctors/getDoctorsByMedicareService';
  private getPatientsDoctorUrl= this.baseUrl + '/doctors/getPatientsDoctor';
  authCredentials = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Basic ' + btoa('admin:admin')
    })
  };

  constructor(public router: Router, private http: HttpClient) { }

  getAllDoctors() {
    return this.http.get(this.getAllDoctorsUrl, this.authCredentials);
  }
  getDoctor(id) {
    return this.http.get(this.getDoctorUrl + id, this.authCredentials);
  }

  updateDoctorApproval(doctor: Doctor) {
    return this.http.put<Doctor>(this.baseUrl + '/doctors/editApproval', doctor, this.authCredentials);
  }


  getAllDoctorsByMedicareService(medicare: Medicare) {
    return this.http.post(this.getAllDoctorsByMedicareServiceUrl,medicare, this.authCredentials);
  }
}
