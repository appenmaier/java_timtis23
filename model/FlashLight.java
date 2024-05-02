package model;

import java.util.Objects;

/**
 * Taschenlampe
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class FlashLight extends Light {

  private double energyLevel;

  public FlashLight() {
    energyLevel = 1;
  }

  public double getEnergyLevel() {
    return energyLevel;
  }

  @Override
  public void switchOn() {
    isOn = true;
    energyLevel -= 0.1;

    if (energyLevel > 0) {
      isShining = true;
    }
  }

  public void recharge() {
    energyLevel = 1;
  }

  @Override
  public String toString() {
    return "FlashLight [energyLevel=" + energyLevel + ", isShining=" + isShining + ", isOn=" + isOn
        + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(energyLevel);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    FlashLight other = (FlashLight) obj;
    return Double.doubleToLongBits(energyLevel) == Double.doubleToLongBits(other.energyLevel);
  }

}
