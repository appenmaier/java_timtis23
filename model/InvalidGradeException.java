package model;

public class InvalidGradeException extends Exception {

  private static final long serialVersionUID = 1L;

  public InvalidGradeException() {
    super("Ungültige Note");
  }

}
