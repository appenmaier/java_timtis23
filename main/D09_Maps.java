package main;

import java.util.HashMap;
import model.InvalidGradeException;
import model.InvalidLectureException;
import model.Student;

/**
 * Assoziativspeicher
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D09_Maps {

  public static void main(String[] args) {

    Student student = new Student("9182543", "Hans Maier", new HashMap<>());

    try {
      student.setGrade("Programmieren", 2.1);
      student.setGrade("Mathematik", 3.5);
      student.setGrade("NT1", 1.7);
      student.setGrade("Th. Informatik", 2.7);
    } catch (InvalidGradeException | InvalidLectureException e) {
      System.err.println(e.getMessage());
    }

    System.out.println(student.grades());
    System.out.println();

    System.out.println(student);
    System.out.println();

    System.out.println(student.getAverageGrade());
    System.out.println();

    System.out.println(student.getLectures());
    System.out.println();

    System.out.println(student.grades().size());
    System.out.println();

    System.out.println(student.grades().get("Mathematik"));

  }

}
