import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { PythagorasResponse } from './response/PythagorasResponse';
import { PythagorasRequest as PythagorasRequest } from './request/PythagorasRequest';


@Injectable({
  providedIn: 'root'
})

export class CalculatorService {
  private baseApiUrl = 'http://localhost:80/api/';
  private apiUrl = `${this.baseApiUrl}calculator/pythagoras`;
  private httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  constructor(private http: HttpClient) { }

  public pythagoras(adjacentValue: number, oppositeValue: number): Observable<PythagorasResponse> {
    let request = new PythagorasRequest(adjacentValue, oppositeValue);
    return this.http.post<PythagorasResponse>(this.apiUrl, JSON.stringify(request), this.httpOptions);
  }

}
