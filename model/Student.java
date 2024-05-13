package model;

import java.util.Map;
import java.util.Set;

public record Student(String id, String name, Map<String, Double> grades) {

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

}
