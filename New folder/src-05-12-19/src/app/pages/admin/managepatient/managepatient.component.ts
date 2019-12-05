import { PatientService } from './../../../service/patient.service';
import { Component, OnInit } from '@angular/core';
import { Patient } from 'src/app/model/patient_model';

@Component({
  selector: 'app-managepatient',
  templateUrl: './managepatient.component.html',
  styleUrls: ['./managepatient.component.css']
})
export class ManagepatientComponent implements OnInit {

  patients: Patient[] = [];
  

  constructor(private patientService: PatientService) { }

  ngOnInit() {
    this.patientService.getAllPatients().subscribe((res: Patient[]) => {
      this.patients = res;
    });
  }
  ApproveOrRejectPatient(event, patient) {
    if (event.target.checked) {
      patient.approve = true;
      this.patientService.updatePatientApproval(patient).subscribe((res) => console.log(res)) ;
    } else {
      patient.approve = false;
      this.patientService.updatePatientApproval(patient).subscribe((res) => console.log(res)) ;
    }
  }

}
