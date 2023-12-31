import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StdService {

  private url = "http://localhost:8080/api/vi/student"

  constructor(private http:HttpClient) { }

  add(body: object){
    return this.http.post(this.url,body);
  }
}
