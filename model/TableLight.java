package model;

/**
 * Tischleuchte
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class TableLight {

  /* Attribute */
  private boolean isShining;
  private boolean isConnected;
  private boolean isOn;
  private LightBulb lightBulb;
  private final PlugType plugType;

  /* Methoden */
  public TableLight() {
    plugType = PlugType.TYPE_F;
  }

  public TableLight(PlugType plugType) {
    this.plugType = plugType;
  }

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

  public boolean isConnected() {
    return isConnected;
  }

  public boolean isOn() {
    return isOn;
  }

  public LightBulb getLightBulb() {
    return lightBulb;
  }

  public PlugType getPlugType() {
    return plugType;
  }

  @Override
  public String toString() {
    return "TableLight [isShining=" + isShining + ", isConnected=" + isConnected + ", isOn=" + isOn
        + ", lightBulb=" + lightBulb + ", plugType=" + plugType + "]";
  }

}
