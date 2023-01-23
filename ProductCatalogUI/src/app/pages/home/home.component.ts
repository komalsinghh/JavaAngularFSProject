import { getLocaleNumberSymbol } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router, TitleStrategy } from '@angular/router';
import { HomeService } from 'src/app/services/home.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  data:any
  constructor(private service:HomeService, private router:Router){}
    ngOnInit() {
      return this.service.getAll().subscribe(data=>{
        this.data=data;
        console.log(data);
      })
    }
    getDetails(id:any){
      this.router.navigate([`/pdetails/${id}`]);
    
    }
   
}
