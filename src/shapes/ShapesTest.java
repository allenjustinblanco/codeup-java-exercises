package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable shape;

        shape = new Square(3);
        System.out.println("Area " + shape.getArea());
        System.out.println("Perimeter " + shape.getPerimeter());

        Measurable myShape = new Rectangle(5, 2);
        System.out.println("Area " + myShape.getArea());
        System.out.println("Perimeter " + myShape.getPerimeter());
    }
  }
