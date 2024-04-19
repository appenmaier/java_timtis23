package model;

/**
 * Glühbirne
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class LightBulb {

  /* Attribute */
  private final String color;

  /* Methoden */
  public LightBulb(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "LightBulb [color=" + color + "]";
  }

}
