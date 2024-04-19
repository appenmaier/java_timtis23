package main;

import model.PlugType;

/**
 * Aufzählungen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D06_Enumerations {

  public static void main(String[] args) {

    PlugType p1 = PlugType.TYPE_F;
    PlugType p2 = PlugType.TYPE_B;
    PlugType p3 = PlugType.TYPE_F;

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

  }

}
