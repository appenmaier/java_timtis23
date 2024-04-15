package model;

/**
 * Tischleuchte
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class TableLight {

  /* Attribute */
  private boolean isShining;
  private boolean isConnected;
  private boolean isOn;
  private LightBulb lightBulb;

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

    if (isOn == true && isConnected == true) {
      isShining = true;
    }
    return oldLightBulb;
  }

  public boolean isShining() {
    return isShining;
  }

  public String getLightBulbColor() {
    if (lightBulb != null) {
      return lightBulb.getColor();
    }
    return null;
  }

  @Override
  public String toString() {
    return "TableLight [isShining=" + isShining + ", isConnected=" + isConnected + ", isOn=" + isOn
        + ", lightBulb=" + lightBulb + "]";
  }

}
