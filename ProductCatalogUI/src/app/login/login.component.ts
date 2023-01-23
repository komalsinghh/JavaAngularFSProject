import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl,FormsModule,NgForm} from '@angular/forms'
import { Route, Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  user=new User();
  msg='';
  constructor(private _service:RegistrationService, private _router:Router){}
  ngOnInit(): void {
    
  }
  loginUser(){
    this._service.loginUserFromRemote(this.user).subscribe(
      data => console.log("Data Received"),
      error => {
        console.log("Error Occured");
        this.msg="Invalid Credentials! Please Enter Correct Email Id and Password.";
      }
    )
  }
 
}
