package model;

/**
 * Tischleuchte
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight {

  /* Attribute */
  public boolean isShining;
  public boolean isConnected;
  public boolean isOn;
  public LightBulb lightBulb;

  /* Methoden */
  /**
   * Steckt die Tischleuchte ein
   */
  public void plugIn() {
    isConnected = true;

    if (isOn == true && lightBulb != null) {
      isShining = true;
    }
  }

  /**
   * Steckt die Tischleuchte aus
   */
  public void pullThePlug() {
    isConnected = false;
    isShining = false;
  }

  /**
   * Schaltet die Tischleuchte ein
   */
  public void switchOn() {
    isOn = true;

    if (isConnected == true && lightBulb != null) {
      isShining = true;
    }
  }

  /**
   * Schaltet die Tischleuchte aus
   */
  public void switchOff() {
    isOn = false;
    isShining = false;
  }

  /**
   * Tauscht die alte Glühbirne durch eine neue aus und gibt die alte Glühbirne zurück
   *
   * @param newLightBulb neue Glühbirne
   * @return alte Glühbirne
   */
  public LightBulb changeLightBulb(LightBulb newLightBulb) {
    LightBulb oldLightBulb = lightBulb;
    lightBulb = newLightBulb;
    return oldLightBulb;
  }

}
