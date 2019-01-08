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
        System.out.println("Enter three words");

        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.format("%s %s %s\n", firstWord, secondWord, thirdWord);

        System.out.println("Enter a sentence");

        String sentence = scanner.next();

        System.out.format("%s\n", sentence);

        System.out.println("Lets calculate the perimeter");
        System.out.println("Enter the length");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width");
        int width = Integer.parseInt(scanner.nextLine());

        int perimeter = 2*length + 2*width;
        int area = width*length;

        System.out.format("The perimeter is %s. The area is %s.\n", perimeter, area);

        // use .equals or .equalsIgnoreCase to compare strings
        // .contains
    }
}
