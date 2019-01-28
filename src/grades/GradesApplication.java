package grades;

import java.util.HashMap;
import grades.Student;

public class GradesApplication{
  public static void main(String[] args){

    HashMap<String, Student> students = new HashMap<>();

    students.put("Adam", new Student("Adam"));
    students.put("Andrew", new Student("Andrew"));
    students.put("Alyssa", new Student("Alyssa"));
    students.put("Allen", new Student("Allen"));

    students.get("Adam").addGrade(50);
    students.get("Adam").addGrade(50);
    students.get("Adam").addGrade(50);
    students.get("Adam").addGrade(50);
    students.get("Andrew").addGrade(50);
    students.get("Andrew").addGrade(50);
    students.get("Andrew").addGrade(50);
    students.get("Andrew").addGrade(50);
    students.get("Alyssa").addGrade(50);
    students.get("Alyssa").addGrade(50);
    students.get("Alyssa").addGrade(50);
    students.get("Alyssa").addGrade(50);
    students.get("Allen").addGrade(100);
    students.get("Allen").addGrade(100);
    students.get("Allen").addGrade(100);
    students.get("Allen").addGrade(100);

    System.out.println("|--------/    /--/----/-----/----/--/     /|");
    System.out.println("|-------/    /--/----/-----/----/--/     /-|");
    System.out.println("|------/    /--/----/-----/----/--/     /--|");
    System.out.println("|-----/    /--/               /--/     /---|");
    System.out.println("|----/    /--/----Welcome----/--/     /----|");
    System.out.println("|---/    /--/               /--/     /-----|");
    System.out.println("|--/    /--/----/-----/----/--/     /------|");
    System.out.println("Here are the github usernames of students: |");
    System.out.println("|/    /--/----/-----/----/--/     /________|");
    String usernames = "";
    for(String user: students.keySet()){
      usernames += user + " | ";
    }
    System.out.println(usernames);
  }

}
