import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{
  menu:String='default';
  userName: string = '';
  constructor(private router:Router){}
  ngOnInit(): void {
    this.router.events.subscribe((val:any)=>{
      if(val.url){
        if(localStorage.getItem('loggedInUser')){
          this.menu="default";
          let userStore = localStorage.getItem('loggedInUser');
          let userData = userStore && JSON.parse(userStore);
           this.userName = userData.userFirstName;
           console.log(this.userName);
        }
        else{
          this.menu="out";
        }
      }
    })
  }
  logout(){
    localStorage.clear();
    this.router.navigate(["/"]).then(()=>{
      window.location.reload();
    })
  }
}
