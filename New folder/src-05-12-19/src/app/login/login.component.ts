import { LoginServiceService } from './../service/login-service.service';
import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormControl, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  emailId: '';
  password: '';


  loginForm: FormGroup;
  constructor(private formBuilder: FormBuilder, private router: Router, private loginService: LoginServiceService) { }


  ngOnInit() {
    this.loginForm = this.formBuilder.group(

      {
        'emailId': new FormControl(this.emailId, [
          Validators.required,
          Validators.minLength(4)
        ]),

        'password': new FormControl(this.password, [
          Validators.required,
          Validators.minLength(4)
        ]),


      }

    )

  }


  onSubmit() {

    //   this.submitted = true;
    if (this.loginForm.invalid) {
      return;
    }

    this.loginService.authenticate(this.loginForm.value.emailId, this.loginForm.value.password)

      .subscribe((res) => {

        this.loginService.getUserId(this.loginForm.value.emailId).subscribe((userId: number) => this.loginService.loggedInUserId = userId);

        if (res.role === "ROLE_ADMIN") {
          this.router.navigateByUrl('/admin/home');
        }
        else if (res.role === "ROLE_DOCTOR") {
          this.router.navigateByUrl('/doctor/home');
        }
        else if (res.role === "ROLE_PATIENT") {
          this.router.navigateByUrl('/patient/home');
        } else {
          this.router.navigateByUrl('/agent/home');
        }

      }, (res) => { console.log('Error!' + res) });

  }

}
