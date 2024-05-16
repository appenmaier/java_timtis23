package main;

import java.util.Optional;

/**
 * Optionals
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D13_Optionals {

  public static void main(String[] args) {

    Optional<String> optional = getText();

    if (optional.isPresent()) {
      String text = optional.get();
      System.out.println(text.length());
    } else {
      System.out.println("Text ist null");
    }

    optional.ifPresentOrElse(text -> System.out.println(text.length()),
        () -> System.out.println("Text ist null"));

  }

  public static Optional<String> getText() {
    return Optional.ofNullable(null);
  }

}
