package model;

import java.util.Objects;

/**
 * Lampe
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Light {

  protected boolean isShining;
  protected boolean isOn;

  public boolean isShining() {
    return isShining;
  }

  public boolean isOn() {
    return isOn;
  }

  public abstract void switchOn();

  public final void switchOff() {
    isOn = false;
    isShining = false;
  }

  @Override
  public String toString() {
    return "Light [isShining=" + isShining + ", isOn=" + isOn + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOn, isShining);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Light other = (Light) obj;
    return isOn == other.isOn && isShining == other.isShining;
  }

}
