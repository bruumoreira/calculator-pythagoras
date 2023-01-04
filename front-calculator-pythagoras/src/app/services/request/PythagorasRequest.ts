export class PythagorasRequest{
  public adjacentValue?: Number;
  public oppositeValue?: Number;

  constructor(adjacentValue: Number, oppositeValue:Number){
    this.adjacentValue = Number(adjacentValue);
    this.oppositeValue = Number(oppositeValue);
  }

}
