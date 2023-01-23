import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SearchService } from 'src/app/services/search.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit{
    constructor(private activeroute:ActivatedRoute,private service:SearchService){}
    data:any;
    ngOnInit(){
       let id=this.activeroute.snapshot.paramMap.get('id');
      console.log(id);
      this.service.getDetails(id).subscribe((data:any)=>{
        this.data=data;
        console.log(data);
      })
    }
    value :any;
    msg:any;
    fullmsg:any;
    checkPincode(){
      let pincodes=[123456,654321,897622];
      for(let i=0;i<pincodes.length;i++){
        if(pincodes[i]==this.value){
          console.log("inside if");
          this.msg="Yes";
          this.fullmsg="Delivery by 22 Jan, Sunday.";
          return;
        }
        else if(pincodes[i]!=this.value){
          console.log("inside else");
          this.msg="No";
          this.fullmsg="Sorry, we do not deliver here.";
        }
      }
    
       
    }
    
}
