package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
  double length;
  double width;

  //constructor
  Quadrilateral(double length, double width){
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
