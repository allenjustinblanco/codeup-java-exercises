package util;

import java.util.Scanner;

public class Input{

        public String getString() {
          System.out.print("Enter a string!");
          String userString = scan.next();
          return userString;
        }
        public boolean yesNo(){
          System.out.print("Enter yes or y to continue.");
          String userEntry = scan.next();
          if (userEntry.equalsIgnoreCase("yes") || userEntry.equalsIgnoreCase("y")){
            return true;
          } else {
            getString();
          }
          return false;
        }

        public int getInt(int min, int max){
          System.out.println("Input an Integer");
          int numberEntry = scan.nextInt();
            if (numberEntry < min || numberEntry > max){
              getInt(min, max);
            } else{
              System.out.println("your number is in range.");
            }
            return numberEntry;
          }
        // public getDouble( double min, double max);
        public double getDouble(double min, double max){
          System.out.println("Input a double");
          double doubleEntry = scan.nextDouble();
          if (doubleEntry < min || doubleEntry > max){
              getDouble(min, max);
          } else{
              System.out.format("your number is between %s and %s.", min, max);
          }
          return doubleEntry;
        }
      }
