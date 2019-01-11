import java.util.Scanner;

public class MethodsExercises {

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    // System.out.print(Addition(1, 2));
    // System.out.print(Subtraction(3, 2));
    // System.out.print(Multiplication(1, 2));
    // System.out.print(Division(1, 2));
    System.out.print(multiply(2,-3));
  }
  //Method Overloading
  private static int Addition(int a, int b){ return a+b; }
  private static double Addition(double a, double b) { return a + b; }
  private static long Addition(long a, long b){ return a + b;}

  private static int Subtraction(int a, int b){ return a - b; }
  private static double Subtraction(double a, double b){ return a - b; }
  private static long Subtraction(long a, long b){ return a - b; }

  private static int Multiplication(int a, int b){ return a * b; }
  private static double Multiplication(double a, double b){ return a * b; }
  // private static long Multiplication(long a, long b){ return a * b; }

  private static int Division(int a, int b){ return a / b; }
  private static double Division(double a, double b){ return a / b; }
  private static long Division(long a, long b){ return a / b; }

  private static int Modulus(int a, int b){ return a % b; }

  //bonus
  // private static long Multiplication(long a, long b){
  //   do{
  //     a+
  //   }
  //   for(int i =1; i<a;i++){
  //
  //   }
  // }
  // for(int i=1; i<a; i++){
  //   int c += (a+b);
  //   return c;
  // }q

  // private static int getInteger(int min, int max){
  //   // System.out.format("Enter a number between %s and %s", min, max);
  //   int userInput = getInteger(min, max);
  //   if(userInput > min && userInput < max){
  //     System.out.print("Input is valid");
  //   } else {
  //     System.out.print("Input invalid");
  //   }
  // }
  // private static int dice(int size){
  //   System.out.print("")
  // }
  private static int multiply(int a, int b){
    if(a == 0 || b==0){
      return 0;
    }
    if(b < 0){
      a++;
      return b - multiply(a,b);
    }else if(b > 0){
      b--;
      return a + multiply(a,b);
    } else {
      b++;
      return a - multiply(a,b);
    }
  }

  private static int dice(int n){
    if(n > 0){
      
    }
  }
}
