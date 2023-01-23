import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class SearchService {

  constructor(private http:HttpClient) { }
  public searchit(searchData:any){
    return this.http.post(`${baseUrl}/search`,searchData);
  }
  public getDetails(id:any):Observable<any>{
    return this.http.get<any>(`${baseUrl}/details/${id}`);
  }
}
