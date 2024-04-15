package main;

import model.PlugType;
import model.TableLight;

/**
 * Aufzählungen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D06_Enumerations {

  public static void main(String[] args) {

    TableLight t1 = new TableLight();
    TableLight t2 = new TableLight(PlugType.TYPE_B);

  }

}
