package model;

/**
 * Tischleuchte
 *
 * @author Daniel Appenmaier
 * @version 4.0
 *
 */
public class TableLight extends Light implements WiredDevice {

  /* Attribute */
  private boolean isConnected;
  private LightBulb lightBulb;
  private final PlugType plugType;

  /* Methoden */
  public TableLight() {
    plugType = PlugType.TYPE_F;
    lightBulb = new LightBulb("weiss");
  }

  public TableLight(PlugType plugType) {
    this.plugType = plugType;
  }

  /**
   * Steckt die Tischleuchte ein
   */
  @Override
  public void plugIn() {
    isConnected = true;

    if (isOn == true && lightBulb != null) {
      isShining = true;
    }
  }

  /**
   * Steckt die Tischleuchte aus
   */
  @Override
  public void pullThePlug() {
    isConnected = false;
    isShining = false;
  }

  /**
   * Schaltet die Tischleuchte ein
   */

  @Override
  public void switchOn() {
    isOn = true;

    if (isConnected == true && lightBulb != null) {
      isShining = true;
    }
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

  public String getLightBulbColor() {
    if (lightBulb != null) {
      return lightBulb.getColor();
    }
    return null;
  }

  public boolean isConnected() {
    return isConnected;
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
