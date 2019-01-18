package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication{
  public static void main(String[] args){

    HashMap<String, Student> students = new HashMap<>();

    Student Adam = new Student("Adam");
    Student Andrew = new Student("Andrew");
    Student Alyssa = new Student("Alyssa");
    Student Allen = new Student("Allen");

    Adam.addGrade(50);
    Adam.addGrade(50);
    Adam.addGrade(50);
    Adam.addGrade(50);
    Andrew.addGrade(50);
    Andrew.addGrade(50);
    Andrew.addGrade(50);
    Andrew.addGrade(50);
    Alyssa.addGrade(50);
    Alyssa.addGrade(50);
    Alyssa.addGrade(50);
    Alyssa.addGrade(50);
    Allen.addGrade(100);
    Allen.addGrade(100);
    Allen.addGrade(100);
    Allen.addGrade(100);

    students.put("Adam", Adam);
    students.put("Andrew", Andrew);
    students.put("Alyssa", Alyssa);
    students.put("Allen", Allen);

    System.out.println("Welcome!!");
    System.out.println("");
    System.out.println("--------------------------------------");
    System.out.println("");
    System.out.println("Here are the github usernames of students:");
    System.out.println("");
    System.out.println(Allen.getName());
  }

}
