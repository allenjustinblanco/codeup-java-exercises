package shapes;

public class Rectangle extends Quadrilateral implements Measureable{
  protected double width;
  protected double length;

  @Override
  public void setLength(double length) {
      this.length = length;
  }

  @Override
  public void setWidth(double width) {
      this.width = width;
  }

  @Override
  public double getArea(){
    return length * width;
  }

  @Override
  public double getPerimeter(){
    return 2*length + 2*width;
  }
}
