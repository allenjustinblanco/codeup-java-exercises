package grades;
import java.util.ArrayList;

public class Student{
  public String name;
  public ArrayList<Integer> grades;

  public Student(String name){
    this.name = name;
    this.grades = new ArrayList<>();
  }

  // returns the student's name
  String getName(){
    return name;
  }

  // adds the given grade to the grades property
  void addGrade(int grade){
    grades.add(grade);
  }

  // returns the average of the students grades
  //add each grade together then divide them by grades length
  private double averageGrade;
  public double getGradeAverage(){
    int length = grades.size();
    for (Integer grade : grades) {
      averageGrade += grade;
    }
    return averageGrade/length;
  }

  public static void main(String[] args){
    Student student1 = new Student("Jim");
    student1.addGrade(50);
    student1.addGrade(50);
    student1.addGrade(100);
    student1.addGrade(100);

    System.out.println(student1.getGradeAverage());

  }

}
