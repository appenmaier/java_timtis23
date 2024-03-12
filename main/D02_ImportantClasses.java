package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Wichtige Java-Klassen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_ImportantClasses {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    /* String */
    String firstName = "Max"; // new String("Max");
    String familyName = "Maier";
    String fullName = firstName + " " + familyName;

    int length = fullName.length();
    char character = fullName.charAt(2);
    String fullNameInUpperCase = fullName.toUpperCase();

    System.out.println("fullName: " + fullName);
    System.out.println("length: " + length);
    System.out.println("character: " + character);
    System.out.println("fullNameInUpperCase: " + fullNameInUpperCase);

    /* PrintStream */
    int x = 42;
    System.out.print("\"x\": " + x + "\n");
    System.out.println("\"x\": " + x);
    System.out.printf("\"x\": %d\n", x);
    System.out.printf("%.2f\n", 5.0 / 3);

    /* Math */
    System.out.println("Math.sqrt(49): " + Math.sqrt(49));

    /* Random */
    Random myRandom = new Random();

    int randomNumber;
    for (int i = 0; i < 10; i++) {
      randomNumber = myRandom.nextInt(1, 101);
      System.out.println(randomNumber);
    }

    /* Scanner */
    Scanner myScanner = new Scanner(System.in);

    System.out.print("Ganze Zahl eingeben: ");
    int int1 = myScanner.nextInt();

    System.out.print("Boolschen Wahrheitswert eingeben: ");
    boolean boolean1 = myScanner.nextBoolean();

    System.out.print("Kommazahl eingeben: ");
    double double1 = myScanner.nextDouble();

    System.out.print("Zeichen eingeben: ");
    char char1 = myScanner.next().charAt(0);

    System.out.print("Zeichenkette eingeben: ");
    myScanner.useDelimiter("\r\n");
    String token = myScanner.next();

    System.out.println("int1: " + int1);
    System.out.println("boolean1: " + boolean1);
    System.out.println("double1: " + double1);
    System.out.println("char1: " + char1);
    System.out.println("token: " + token);

    /* ArrayList */
    ArrayList<String> names = new ArrayList<>();

    names.add("Max");
    names.add("Lisa");
    names.add("Peter");
    names.add(1, "Fritz");

    int size = names.size();
    System.out.println("size: " + size);

    names.remove("Peter");

    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      System.out.println(name);
    }

    for (String name : names) {
      System.out.println(name);
    }

    System.out.println(names);

  }

}
