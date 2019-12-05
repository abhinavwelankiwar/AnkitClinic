import { TestresultsComponent } from './pages/doctor/testresults/testresults.component';
import { ViewappointmentsComponent } from './pages/doctor/viewappointments/viewappointments.component';
import { DoctorhomeComponent } from './pages/doctor/doctorhome/doctorhome.component';
import { BookappointmentformComponent } from './pages/patient/bookappointment/bookappointmentform/bookappointmentform.component';
import { ChoosedoctorsComponent } from './pages/patient/bookappointment/choosedoctors/choosedoctors.component';
import { ViewappointmentstatusComponent } from './pages/patient/viewappointmentstatus/viewappointmentstatus.component';
import { ViewappointmenthistoryComponent } from './pages/patient/viewappointmenthistory/viewappointmenthistory.component';
import { AddMedicareComponent } from './pages/admin/add-medicare/add-medicare.component';
import { ManageagentComponent } from './pages/admin/manageagent/manageagent.component';
import { AdminhomeComponent } from './pages/admin/adminhome/adminhome.component';
import { ManagedoctorComponent } from './pages/admin/managedoctor/managedoctor.component';
import { SignupdoctorComponent } from './site/signupdoctor/signupdoctor.component';
import { SignuppatientComponent } from './site/signuppatient/signuppatient.component';
import { SignupadminComponent } from './site/signupadmin/signupadmin.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ManagepatientComponent } from './pages/admin/managepatient/managepatient.component';
import { AddagentComponent } from './pages/admin/manageagent/addagent/addagent.component';
import { ManagemedicareComponent } from './pages/admin/managemedicare/managemedicare.component';
import { PatienthomeComponent } from './pages/patient/patienthome/patienthome.component';
import { BookappointmentComponent } from './pages/patient/bookappointment/bookappointment.component';
import { HomepageComponent } from './homepage/homepage.component';
import { GetstartedComponent } from './getstarted/getstarted.component';


const routes: Routes = [
  { path: '', component: HomepageComponent },
  { path: 'homepage', component: HomepageComponent },
  { path: 'signup-admin', component: SignupadminComponent },
  { path: 'signup-patient', component: SignuppatientComponent },
  { path: 'signup-doctor', component: SignupdoctorComponent },
  { path: 'login', component: LoginComponent },
  { path: 'admin/manage-doctors', component: ManagedoctorComponent },
  { path: 'admin/manage-patients', component: ManagepatientComponent },
  { path: 'admin/manage-agent', component: ManageagentComponent },
  { path: 'admin/manage-agent/add-agent', component: AddagentComponent },
  { path: 'admin/home', component: AdminhomeComponent },
  { path: 'admin/manage-medicare', component: ManagemedicareComponent },
  { path: 'admin/manage-medicare/add-medicare', component: AddMedicareComponent },
  { path: 'patient/home', component: PatienthomeComponent },
  { path: 'patient/bookappointment', component: BookappointmentComponent },
  { path: 'patient/bookappointment/choosedoctors/:id', component: ChoosedoctorsComponent },
  { path: 'patient/viewappointmenthistory', component: ViewappointmenthistoryComponent },
  { path: 'patient/viewappointmentstatus', component: ViewappointmentstatusComponent },
  { path: 'patient/bookappointment/bookappointmentform/:medId/:docId', component: BookappointmentformComponent },
  { path: 'doctor/home', component: DoctorhomeComponent },
  { path: 'doctor/viewappointments', component: ViewappointmentsComponent },
  { path: 'doctor/testresults', component: TestresultsComponent },
  { path: 'getstarted', component: GetstartedComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
