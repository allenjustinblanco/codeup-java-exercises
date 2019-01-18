package shapes;

abstract class Quadrilateral extends Shape implements Measureable {
  protected double length;
  protected double width;

  //constructor
  public Quadrilateral (double length, double width){
    this.length = length;
    this.width = width;
  }

  //getter
  public double getWidth(){
    return width;
  }

  public double getLength(){
    return length;
  }

  public abstract void setWidth(double width);
  public abstract void setLength(double length);

}
