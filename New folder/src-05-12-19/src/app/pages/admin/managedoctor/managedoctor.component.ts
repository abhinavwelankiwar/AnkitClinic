import { Medicare } from './../../../model/medicare_service_model';
import { DoctorService } from './../../../service/doctor.service';
import { Component, OnInit } from '@angular/core';
import { Doctor } from 'src/app/model/doctor_model';

@Component({
  selector: 'app-managedoctor',
  templateUrl: './managedoctor.component.html',
  styleUrls: ['./managedoctor.component.css']
})
export class ManagedoctorComponent implements OnInit {

  doctors: Doctor[] = [];
  medicareServices: Medicare[] = [];

  constructor(private doctorService: DoctorService) { }

  ngOnInit() {
    this.doctorService.getAllDoctors().subscribe((res: Doctor[]) => {
      this.doctors = res;
    });
  }
  ApproveOrRejectDoactor(event, doctor) {
    if (event.target.checked) {
      doctor.approve = true;
      this.doctorService.updateDoctorApproval(doctor).subscribe((res) => console.log(res)) ;
    } else {
      doctor.approve = false;
      this.doctorService.updateDoctorApproval(doctor).subscribe((res) => console.log(res)) ;
    }
  }
}
