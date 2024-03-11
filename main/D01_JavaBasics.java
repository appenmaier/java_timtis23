package main;

/**
 * Grundlegende Sprachelemente
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D01_JavaBasics {

  public static void arithmeticOperations() {
    int result1 = 5 + 3;
    int result2 = 5 - 3;
    int result3 = 5 * 3;
    int result4 = 5 / 3;
    int result5 = 5 % 3;
    double result6 = (double) 5 / 3;

    int c = 0;
    c = c + 1;
    c += 1;
    c++; // c--;

    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
    System.out.println("result3: " + result3);
    System.out.println("result4: " + result4);
    System.out.println("result5: " + result5);
    System.out.println("result6: " + result6);
    System.out.println("c: " + c);
  }

  public static void arrays() {
    int[] numbers = new int[5]; // C/C++: int numbers[5];
    String[] names = {"Max", "Lisa", "Peter"};

    numbers[3] = 42;
    System.out.println(names[1]);
    System.out.println("names.length: " + names.length);
  }

  public static void cases() {
    /* Bedingte Anweisung */
    int age = 18;
    char gender = 'm';

    // Logische Operatoren: &&, ||, !
    // Vergleichsoperatoren: >, <, >=, <=, ==, !=
    // Bedingungs-Operator: ?
    if (gender == 'm' && (age >= 12 && age < 18)) {
      System.out.println("männlicher Teenager");
    } else if (gender == 'w' || gender == 'W') {
      System.out.println("weiblich");
    } else {
      System.out.println("divers, Junge, Mann");
    }

    boolean isAdult = age >= 18 ? true : false;
    System.out.println("isAdult: " + isAdult);

    /* Fallunterscheidungen */
    String genderText;
    switch (gender) {
      case 'M':
      case 'm':
        genderText = "männlich";
        break;
      case 'W':
      case 'w':
        genderText = "weiblich";
        break;
      default:
        genderText = "divers";
        break;
    }
    System.out.println("genderText: " + genderText);

    /* seit Java 14 */
    genderText = switch (gender) {
      case 'm', 'M' -> "männlich";
      case 'w', 'W' -> "weiblich";
      default -> "divers";
    };
    System.out.println("genderText: " + genderText);
  }

  public static void loops() {
    int i = 0;
    while (i < 5) {
      System.out.println(i + 1);
      i++;
    }
    System.out.println();

    i = 0;
    do {
      System.out.println(i + 1);
      i++;
    } while (i < 5);
    System.out.println();

    for (i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue; // break;
      }
      System.out.println(i + 1);
    }
    System.out.println();
  }

  public static void main(String[] args) {

    /* Primitiven Datentypen */
    primitiveDatatypes();
    System.out.println();

    /* Arithmetische Operatoren und Typumwandlungen */
    arithmeticOperations();
    System.out.println();

    /* Bedingte Anweisungen und Fallunterscheidungen */
    cases();
    System.out.println();

    /* Schleifen */
    loops();
    System.out.println();

    /* Zeichenketten (Strings) */
    strings();
    System.out.println();

    /* Felder (Arrays) */
    arrays();
    System.out.println();

  }

  public static void primitiveDatatypes() {
    /* Ganze Zahlen: byte, short, int, long */
    int i = 42;

    /* Kommazahlen / Gleitkommazahlen: float, double */
    double salaryInEuro = 2_999_542.55;

    /* Boolscher Wahrheitswert: boolean */
    boolean isSuper = false;

    /* Zeichen: char */
    char a1 = 'A';
    char a2 = 65;
    char a3 = '\u0041';
    char a4 = 0b1000001; // 0 (Oktal), 0b (Binär), 0x (Hexadezimal)

    System.out.println("i: " + i); // C: printf("i: %d\n", i); C++: cout << "i: " << i << endl;
    System.out.println("salaryInEuro: " + salaryInEuro);
    System.out.println("isSuper: " + isSuper);
    System.out.println("a1: " + a1);
    System.out.println("a2: " + a2);
    System.out.println("a3: " + a3);
    System.out.println("a4: " + a4);
  }

  public static void strings() {
    String names = "Max"; // C: char names[50] = "Max";

    int length = names.length(); // C: int length = strlen(names);
    names = names + ";Lisa;Peter"; // C/C++: strcat(names, ";Lisa;Peter");
    String[] tokens = names.split(";");

    if (names.equals("Max;Lisa;Peter")) { // C/C++: if (strcmp(names, "Max;Peter;Lisa") == 0) {...}
      System.out.println(true);
    }

    System.out.println("length: " + length);
    System.out.println("names: " + names);
    System.out.println("tokens: " + tokens);

    for (int i = 0; i < tokens.length; i++) {
      System.out.println(i + ": " + tokens[i]);
    }
  }

}
