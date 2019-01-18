package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
  private double width;
  private double length;

  Rectangle(double length, double width) {
    super(length, width);
  }

  @Override
  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public void setLength(double length) {
      this.length = length;
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
