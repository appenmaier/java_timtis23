package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.InvalidGradeException;
import model.InvalidLectureException;
import model.Student;

/**
 * Java Stream API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D12_JavaStreamAPI {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student("8265473", "Hans Maier", new HashMap<String, Double>()));
    students.add(new Student("9917246", "Lisa Schmid", new HashMap<String, Double>()));

    try {
      students.get(0).setGrade("Mathe", 1.4);
      students.get(0).setGrade("IT", 2.1);
      students.get(1).setGrade("Mathe", 2.2);
      students.get(1).setGrade("IT", 3.0);
    } catch (InvalidLectureException e) {
      e.printStackTrace();
    } catch (InvalidGradeException e) {
      e.printStackTrace();
    }

    /* imperatives Vorgehen */
    double total = 0;
    int numberOfGrades = 0;
    for (Student s : students) {
      if (s.grades().containsKey("Mathe")) {
        total += s.grades().get("Mathe");
        numberOfGrades++;
      }
    }
    System.out.println(total / numberOfGrades);

    /* funktionales Vorgehen */
    System.out.println(students.stream().filter(s -> s.grades().containsKey("Mathe"))
        .mapToDouble(s -> s.grades().get("Mathe")).average());

  }

}
