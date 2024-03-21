package main;

import model.LightBulb;
import model.TableLight;

/**
 * Klassen, Attribute, Methoden, Objekte und Referenzen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_ObjectsAndReferences {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    LightBulb redLightBulb = new LightBulb("rot");
    LightBulb blueLightBulb = new LightBulb("blau");

    TableLight tableLight1 = new TableLight();
    tableLight1.plugIn();
    tableLight1.switchOn();
    LightBulb oldLightBulb = tableLight1.changeLightBulb(blueLightBulb);

    if (tableLight1.isShining() == true) {
      System.out.println("Die Tischleuchte " + tableLight1 + " leuchtet in der Farbe "
          + tableLight1.getLightBulbColor());
    }

    oldLightBulb = tableLight1.changeLightBulb(redLightBulb);

    if (tableLight1.isShining() == true) {
      System.out.println("Die Tischleuchte " + tableLight1 + " leuchtet in der Farbe "
          + tableLight1.getLightBulbColor());
    }

  }

}
