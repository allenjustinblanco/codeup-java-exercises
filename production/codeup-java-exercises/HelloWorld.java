import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Hello, World!");
        int myFavoriteNumber = 509;
        String myString = "Justin";
        System.out.println(myString);
        long myNumber = 38787914L;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        double pi = 3.14159;
        int three = Integer.parseInt("3");
        System.out.println(three);
        float almostPi = (float) pi;

        System.out.format("The value of pi is approximately %s\n", almostPi);
        System.out.println("Enter an Integer.");
        String userInt = scanner.nextLine();

    }
}
