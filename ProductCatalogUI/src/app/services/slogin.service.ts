import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class SloginService {

  constructor(private http:HttpClient) { }
  public loginUser(loginData:any){
    return this.http.post(`${baseUrl}/login`,loginData);
  }
}
