import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { SloginService } from 'src/app/services/slogin.service';

@Component({
  selector: 'app-ulogin',
  templateUrl: './ulogin.component.html',
  styleUrls: ['./ulogin.component.css']
})
export class UloginComponent implements OnInit{
  loginData={
    userEmail:'',
    userPassword:'',
  }
    constructor(private snack:MatSnackBar, private loginService:SloginService,private router:Router){}
    ngOnInit(): void {
      
    }
    formSubmit(){
      console.log("login working");
      if(this.loginData.userEmail.trim()=='' || this.loginData.userEmail.trim()==null){
        this.snack.open('Please enter email','',{
          duration:3000,
        });
        return;
      }
      if(this.loginData.userPassword.trim()=='' || this.loginData.userPassword.trim()==null){
        this.snack.open('Please enter password','',{
          duration:3000,
        });
        return;
      }
      this.loginService.loginUser(this.loginData).subscribe((data:any)=>{
        console.log("success");
        console.log(data);
        localStorage.setItem('loggedInUser',JSON.stringify(data));
        this.router.navigate(['/home'])
      },
      (error)=>{
        console.log("error went");
        console.log(error);
        this.snack.open('Invalid Credential!','',{
          duration:3000,
        });
        this.loginData.userEmail='';
        this.loginData.userPassword='';
      }

      )
    }
}
