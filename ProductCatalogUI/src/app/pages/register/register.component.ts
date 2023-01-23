import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{
  
  constructor(private userService:UserService, private snack:MatSnackBar,private router:Router){}
  public user={
    userFirstName:'',
    userLastName:'',
    userEmail:'',
    userPassword:''
 }
  ngOnInit(): void {
    
  }
  formSubmit(){
    console.log(this.user);
    if(this.user.userEmail.trim()==='' && this.user.userFirstName.trim()==='' &&
    this.user.userLastName.trim()==='' && this.user.userPassword.trim()==='' ){
      this.snack.open('Each fields are mandatory!','',{
        duration:3000,
      });
      return;
    }
     if(this.user.userEmail.trim()!='' && this.user.userFirstName.trim()!='' &&
     this.user.userLastName.trim()!='' && this.user.userPassword.trim()!='' ){
      this.userService.addUser(this.user).subscribe(
        (data)=>{
          console.log(data);
          Swal.fire('Success','Successfully registered!');
          this.router.navigate(["/"]);
       },
        (error)=>{
          console.log(error);
          this.snack.open('Something went wrong!','',{
            duration:3000,
          });
        }
      )
    }
  }
}
