import { LoginServiceService } from './../../../service/login-service.service';
import { Doctor } from 'src/app/model/doctor_model';
import { DoctorService } from './../../../service/doctor.service';
import { AppointmentService } from './../../../service/appointment.service';
import { Appointment } from './../../../model/appointment_model';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewappointmenthistory',
  templateUrl: './viewappointmenthistory.component.html',
  styleUrls: ['./viewappointmenthistory.component.css']
})
export class ViewappointmenthistoryComponent implements OnInit {

  appointments: Appointment[];
  patientId: number;
  currdate = new Date();
  isCurrentDateGreater = false;


  constructor(private docService: DoctorService, private router: Router, private appointmentService: AppointmentService, private loginservice: LoginServiceService) { }

  ngOnInit() {



    this.patientId = this.loginservice.loggedInUserId;

    this.appointmentService.getPatientsDoctor(this.patientId).subscribe((res: Appointment[]) => {
      this.appointments = res;
      // console.log(this.doctors);
    });
   
  }

  checkDate(): boolean {
    if (this.currdate > this.appointments[2].dateOfAppointment) {
      return true;
    } else {
      return false;
    }
  }
}
