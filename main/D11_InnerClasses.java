package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import model.InvalidGradeException;
import model.InvalidLectureException;
import model.Student;

/**
 * Innere Klassen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D11_InnerClasses {

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

    /* Lokale Klassen */
    class StudentsByAverageGradeComparator implements Comparator<Student> {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.getAverageGrade().compareTo(o2.getAverageGrade());
      }
    }
    Collections.sort(students, new StudentsByAverageGradeComparator());

    class StudentPrinter implements Consumer<Student> {
      @Override
      public void accept(Student t) {
        System.out.println(t);
      }
    }
    students.forEach(new StudentPrinter());
    System.out.println();

    /* Anonyme Klassen */
    Collections.sort(students, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o2.getAverageGrade().compareTo(o1.getAverageGrade());
      }
    });

    students.forEach(new Consumer<Student>() {
      @Override
      public void accept(Student t) {
        System.out.println(t);
      }
    });
    System.out.println();

    /* Lamda-Ausdrücke */
    Collections.sort(students,
        (student1, student2) -> student1.getAverageGrade().compareTo(student2.getAverageGrade()));

    students.forEach(t -> System.out.println(t));
    students.forEach(t -> t.greet());
    System.out.println();

    /* Methodenreferenzen */
    students.forEach(System.out::println);
    students.forEach(Student::greet);

  }

}
