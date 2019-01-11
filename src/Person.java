import java.util.Scanner;

class Person {
  // returns the person's name
  public static String getName(String name){
    return name;
  }
  // changes the name property to the passed value
  public void setName(String name){
  }
  // prints a message to the console using the person's name
  public void sayHello(){
    return String.format("Hello %s.\n", name)
  }
}
