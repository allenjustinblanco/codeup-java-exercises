import java.util.Arrays;

public class ArrayExercises{
  public static void main(String[] args){
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(numbers));

    Person[] Person = new Person[4];

    Person[0] = new Person("Bob");
    Person[1] = new Person("Joe");
    Person[2] = new Person("Bill");
    Person[3] = new Person("Sam");

    for(Person x : Person){
      System.out.println(x.getName());
    }
    System.out.println(Person.length());
  }
  // public static void addPerson(Person[] people){
  //
  // }
}
