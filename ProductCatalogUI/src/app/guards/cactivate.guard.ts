import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CactivateGuard implements CanActivate {
  constructor(private router:Router,private snack:MatSnackBar){}
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      if(localStorage.getItem("loggedInUser")==null){
        this.snack.open('Please Enter Credential!','',{
          duration:3000,
        });
        this.router.navigate(["/"]);
        return false;
      }
      else{
    return true;
      }
  }
  
}
