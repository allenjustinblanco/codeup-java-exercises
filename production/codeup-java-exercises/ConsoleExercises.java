import java.util.Scanner;

public class ConsoleExercises{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    double pi = 3.14159;
    System.out.format("The value of pi is approximately %.2f", pi);

    System.out.print("Enter an Integer");
    int userInt = sc.next();

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
