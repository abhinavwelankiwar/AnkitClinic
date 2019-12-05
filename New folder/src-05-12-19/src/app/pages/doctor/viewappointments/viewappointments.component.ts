import { Appointment } from './../../../model/appointment_model';
import { Router } from '@angular/router';
import { DoctorService } from './../../../service/doctor.service';
import { AppointmentService } from './../../../service/appointment.service';
import { LoginServiceService } from './../../../service/login-service.service';
import { Component, OnInit } from '@angular/core';
import { Route } from '@angular/compiler/src/core';
import { Doctor } from 'src/app/model/doctor_model';
import { Patient } from 'src/app/model/patient_model';

@Component({
  selector: 'app-viewappointments',
  templateUrl: './viewappointments.component.html',
  styleUrls: ['./viewappointments.component.css']
})
export class ViewappointmentsComponent implements OnInit {

  appointments: Appointment[];
  paitents: Patient[];
  doctor: Doctor;

  constructor(private loginservice: LoginServiceService, private appointmentservice: AppointmentService, private docService: DoctorService, private router: Router) { }

  ngOnInit() {

    this.docService.getDoctor(this.loginservice.loggedInUserId).subscribe((res: Doctor) => {
      this.doctor = res;
      this.appointmentservice.getAppointmenstByDoctor(this.doctor).subscribe((res: Appointment[]) => {
        this.appointments = res;
        
      });
    });



  }

}
