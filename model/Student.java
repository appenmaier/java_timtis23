package model;

import java.util.Map;
import java.util.Set;

/**
 * Studierender
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Student(String id, String name, Map<String, Double> grades)
    implements Comparable<Student> {

  public void setGrade(String lecture, double grade)
      throws InvalidGradeException, InvalidLectureException {
    if (grade <= 0) {
      throw new InvalidGradeException();
    }

    if (lecture == null) {
      throw new InvalidLectureException();
    }

    grades.put(lecture, grade);
  }

  public Double getAverageGrade() {
    double total = 0;

    // for(Entry<String, Double> entry : grades.entrySet()) {
    // total += entry.getValue();
    // }

    for (Double grade : grades.values()) {
      total += grade;
    }

    return total / grades.size();
  }

  public Set<String> getLectures() {
    return grades.keySet();
  }

  @Override
  public int compareTo(Student o) {
    return name.compareTo(o.name);
  }

  public void greet() {
    System.out.println("Hallo, mein Name lautet " + name);
  }

}
