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
    }

    optional.ifPresent(t -> t.length());

  }

  public static Optional<String> getText() {
    return Optional.ofNullable(null);
  }

}
