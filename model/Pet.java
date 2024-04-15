package model;

/**
 * Haustier
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Pet {

  /* Attribute */
  private final String name;
  private final String type;
  private double weightInKg;
  private double sizeInM;

  /* Methoden */
  public Pet(String name, String type, double weightInKg, double sizeInM) {
    this.name = name;
    this.type = type;
    this.weightInKg = weightInKg;
    this.sizeInM = sizeInM;
  }

  public void eat() {
    weightInKg *= 1.1;
    System.out.println(name + " frisst, und wiegt nun " + weightInKg + "kg");
  }

  public void move() {
    weightInKg *= 0.95;
    System.out.println(name + " bewegt sich und nimmt ab");
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public double getWeightInKg() {
    return weightInKg;
  }

  public double getSizeInM() {
    return sizeInM;
  }

  @Override
  public String toString() {
    return "Pet [name=" + name + ", type=" + type + ", weightInKg=" + weightInKg + ", sizeInM="
        + sizeInM + "]";
  }

}
