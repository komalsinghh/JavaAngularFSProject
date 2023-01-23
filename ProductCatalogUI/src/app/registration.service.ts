import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import {Observable,map} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private _http: HttpClient) { }
  
  public loginUserFromRemote(user: User):Observable<any>{
    return this._http.post<any>("http://localhost:8180/login",user);
  }
  
  public getDetails():Observable<any>{
    return this._http.get("http://localhost:8180/details/5");
  }
  
}
