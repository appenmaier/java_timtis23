package model;

public class InvalidLectureException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public InvalidLectureException() {
    super("Ungültige Vorlesung");
  }

}
