package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Scanner;
import model.PlugType;

/**
 * JavaAPI
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D05_JavaAPI {

  public static void main(String[] args) throws FileNotFoundException {

    /* Wrapper-Klassen */
    double double1 = Double.parseDouble("3.14");
    Double double2 = Double.valueOf("3.14");
    System.out.println("double1: " + double1);
    System.out.println("double2: " + double2);

    String doubleText = String.valueOf(double1);
    System.out.println(doubleText);

    /* LocalDate / LocalTime / LocalDateTime */
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now.getDayOfYear());
    System.out.println(now.getNano());
    System.out.println(now);

    LocalDateTime christmas = LocalDateTime.of(2024, 12, 24, 0, 0);
    System.out.println(christmas);

    /* Scanner, File */
    File file = new File("resources/inputs.csv");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");

      double number = Double.parseDouble(tokens[0]);
      String text = tokens[1];
      char sign = tokens[2].charAt(0);
      PlugType plugType = PlugType.valueOf(tokens[3]);

      System.out.println(number + " " + text + " " + sign + " " + plugType.getNorm());
    }

    scanner.close();

  }

}
