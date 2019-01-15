
public class Person {
    private String name;
    // sets the name
    public Person(String name) {
        this.name = name;
    }
    // returns the name
    //getter (gets a value)
    public String getName() {
        return name;
    }
    //setter (sets a value)
    // sets the name property of the object to the name input
    public void setName(String name) {
        this.name = name;
    }
    // prints the message in the console
    public void sayHello() {
        System.out.println("Hello my name is " + name + "!");
    }

    public static void main(String[] args) {
      Person person1 = new Person("John");
      Person person2 = person1;

      System.out.println(person1.getName());
      System.out.println(person2.getName());

      person2.setName("Jane");
      System.out.println(person1.getName());
      System.out.println(person2.getName());

      System.out.println(person1);
      System.out.println(person2);
    }
}
