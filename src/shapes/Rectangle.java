public class Rectangle{
  protected int length;
  protected int width;

  public Rectangle(int length, int width){
    this.length = length;
    this.width = width;
  }
  public Rectangle(int side){
    this.length = side;
    this. width = side;
  }

  public int getArea(){
    return length * width;
  }
  public int getPerimeter(){
    return (2*length) + (2*width);
  }

}
