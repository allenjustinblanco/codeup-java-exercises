package grades;
import java.util.ArrayList;

public class Student{
  private String name;
  private static ArrayList<Integer> grades = new ArrayList<>();

  public void Student(String name){
    this.name = name;
  }

  // returns the student's name
  public String getName(){
    return name;
  }

  // adds the given grade to the gruuades property
  public void addGrade(int grade){
    grades.add(grade);
  }

  // returns the average of the students grades
  //add each grade together then divide them by grades length
  double averageGrade;
  public double getGradeAverage(){
    int length = grades.size();
    for(int i = 0; i < grades.size(); i++){
      averageGrade += grades.get(i);
    }
    return averageGrade/length;
  }

  public static void main(String[] args){
    Student student1 = new Student();
    student1.addGrade(50);
    student1.addGrade(50);
    student1.addGrade(100);
    student1.addGrade(100);

    System.out.println(student1.getGradeAverage());

  }

}
