package model;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Person(String name, int age, char gender) implements Comparable<Person> {

  @Override
  public int compareTo(Person o) {
    return name.compareTo(o.name());
  }

}
