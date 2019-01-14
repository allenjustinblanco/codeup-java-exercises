import java.util.Scanner;

public class ControlFlowExercises {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    int i = 5;
    while(i<=15){
      System.out.println(i);
      i++;
    }

    // long x = 2;
    // do {
    //   System.out.println(x);
    //   x=x*x;
    // } while (x <= 10000);

    for(int x=2; x<=10000; x*=x){
      System.out.println(x);
    }

    int n = 100;
    for(int z=1; z<n; z++){
      System.out.println(z);
      if(z%3 == 0 && z%5 == 0){
        System.out.println("Fizz Buzz");
      } else if (z%5 == 0) {
        System.out.println("Buzz");
      } else if (z%3 == 0) {
        System.out.println("Fizz");
      }
    }
    System.out.println("Enter an Integer");
    String userEntry = scan.next();
    System.out.println("Would you like to continue? Y/N");
    boolean userInput = scan.next().equalsIgnoreCase("yes") || scan.next().equalsIgnoreCase("y");
    // for(int i=0; i<=userEntry; i++){
    //   int intArray = intArray + i;
    // };
    String userTable = "number: ";
    if(userInput){
      System.out.println(userTable);
    }
  }
}
