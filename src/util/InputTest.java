package util;

public class InputTest{
  public static void main(String[] args){
    //Datatype variableName = new Classname
    Input Input = new Input();

    System.out.println(Input.getString());
    System.out.println(Input.yesNo());
    System.out.println(Input.getInt(1, 20));
    System.out.println(Input.getDouble(2, 24));
  }
}
