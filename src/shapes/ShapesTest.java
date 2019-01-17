public class ShapesTest{
  public static void main(String[] args){
    Rectangle box1 = new Rectangle(5, 4);

    System.out.println("The Area of box 1 is " + box1.getArea());
    System.out.println("The Perimeter of box 1 is " + box1.getPerimeter());

    Rectangle box2 = new Square(5);

    System.out.println("The Area of box 2 " + box2.getArea());
    System.out.println("The Perimeter of box 2 is " + box2.getPerimeter());

  }
}
