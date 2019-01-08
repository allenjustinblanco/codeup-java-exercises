import java.util.Scanner;

public class ControlFlowExercises {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    int i = 5;
    while(i<=15){
      System.out.println(i);
      i++;
    }
    int x = 2;
    do {
      int squared = Math.pow(x, 2);
    } while (x < 1000000) {
      System.out.println(squared);
    };
  }
}
