import { HttpClient } from '@angular/common/http';
import { Component, OnInit} from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { SearchService } from 'src/app/services/search.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  searchData={
    productName:'',
    productBrand:'',
    productCode:''
  }
  
  data:any=[];
  price:any;
  constructor(private router: Router, private service:SearchService,private snack:MatSnackBar,private http:HttpClient){}
  ngOnInit(): void {
    
  }
formSearch(){
console.log(this.searchData);
this.service.searchit(this.searchData).subscribe((data:any)=>{
  console.log("success");
  this.data=data;
  console.log(data);
  if(this.data.length==0){
    this.snack.open('Sorry this product is not available!','',{
      duration:5000,
    });
  }
})
}
getDetails(id:any){
  this.router.navigate([`/pdetails/${id}`]);

}
onSortDirection(){
   this.data=this.data.sort((a:any,b:any)=>(a.productPrice<b.productPrice)?1:-1);
 return this.data;

}
onSortDirectionOpp(){
  this.data=this.data.sort((a:any,b:any)=>(a.productPrice<b.productPrice)?-1:1);
 return this.data;
}
}
