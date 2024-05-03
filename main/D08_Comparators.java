package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Person;

/**
 * Komparatoren
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D08_Comparators {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
    numbers.add(4);
    numbers.add(8);
    numbers.add(3);
    numbers.add(7);
    numbers.add(5);

    Collections.sort(numbers);
    for (Integer i : numbers) {
      System.out.println(i);
    }

    List<String> names = new ArrayList<>();
    names.add("Hans");
    names.add("Lisa");
    names.add("Max");
    names.add("Anna");

    Collections.sort(names);
    for (String i : names) {
      System.out.println(i);
    }

    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Hans", 42, 'm'));
    persons.add(new Person("Lisa", 17, 'w'));
    persons.add(new Person("Max", 11, 'm'));
    persons.add(new Person("Anna", 39, 'w'));

    Collections.sort(persons);
    for (Person i : persons) {
      System.out.println(i);
    }

  }

}
