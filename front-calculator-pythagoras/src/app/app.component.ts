import { Component, OnInit } from '@angular/core';

import { CalculatorService } from './services/calculator.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  title = 'calculator-pythagoras';
  oppositeValue?: number;
  adjacentValue?: number;
  resultHypotenuse?: number;


  ngOnInit(): void{
  }

  constructor(private calculatorService: CalculatorService) {
  }

  calculate(){
    if(this.adjacentValue == null){
      console.log("Erro 'cateto adjacente' é obrigatório!")
      return
    }

    if(this.oppositeValue == null){
      console.log("Erro 'cateto oposto' é obrigatório!")
      return
    }

    this.calculatorService.pythagoras(this.adjacentValue, this.oppositeValue).subscribe(response =>
       this.resultHypotenuse = response.result
    )
  }


}
