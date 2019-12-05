import { AppModule } from './../../../app.module';
import { Component, OnInit } from '@angular/core';
import { Appointment } from 'src/app/model/appointment_model';
import { DoctorService } from 'src/app/service/doctor.service';
import { Router } from '@angular/router';
import { AppointmentService } from 'src/app/service/appointment.service';
import { LoginServiceService } from 'src/app/service/login-service.service';

@Component({
  selector: 'app-viewappointmentstatus',
  templateUrl: './viewappointmentstatus.component.html',
  styleUrls: ['./viewappointmentstatus.component.css']
})
export class ViewappointmentstatusComponent implements OnInit {

  appointments: Appointment[];
  patientId: number;
  currdate: Date;
  // isCurrentDateGreater = false;


  // tslint:disable-next-line: max-line-length
  constructor(private docService: DoctorService, private router: Router, private appointmentService: AppointmentService, private loginservice: LoginServiceService) { }

  ngOnInit() {


    this.currdate = new Date();
    this.patientId = this.loginservice.loggedInUserId;

    this.appointmentService.getPatientsDoctor(this.patientId).subscribe((res: Appointment[]) => {
      this.appointments = res;

      this.filterItems();
      // console.log(this.doctors);
    });

  }

  filterItems() {
    let result: Appointment[] = [];
    /*this.appointments.forEach(function(app){
      if (app.dateOfAppointment >= this.currdate) {
        result.push(app);
      } 
    })*/

    // tslint:disable-next-line: prefer-for-of
    // tslint:disable-next-line: prefer-for-of

    this.appointments.forEach((app) => {

console.log(this.currdate + "  " + app.dateOfAppointment)

      if (this.currdate <= app.dateOfAppointment) {
        result.push(app);
      }
    });
    /*   for (let i = 0; i < this.appointments.length; i++)
      {
        if(this.appointments[i].dateOfAppointment.getTime() >= this.currdate.getTime())
        {
          app.dateOfAppointment =this.appointments[i].dateOfAppointment;
          app.agent = this.appointments[i].agent;
          app.timeSlot = this.appointments[i].timeSlot;
          app.status = this.appointments[i].status;
          app.patientId = this.appointments[i].patientId;
  
          result.push(app);
        }
      } */
    console.log(result);
    this.appointments = result;
  }

}
