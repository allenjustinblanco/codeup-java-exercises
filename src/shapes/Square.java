public class Square extends Rectangle{
  pubic Square(int side){
    super(side, side);
    name = Square;
  }

  @Override
  public int getArea(){
    return side ^ 2;
  }

  public in getPerimeter(){
    return 4*side;
  }

}
