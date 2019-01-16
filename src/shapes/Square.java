public class Square extends Rectangle{
  pubic Square(int length, int width){
    super(length, width);
  }
  public int getArea(){
    return side ^ 2;
  }

  public in getPerimeter(){
    return 4 * side;
  }

}
