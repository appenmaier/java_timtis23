package main;

import java.util.ArrayList;
import java.util.List;
import model.FlashLight;
import model.Light;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Vererbung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D07_Inheritance {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    List<TableLight> tableLights = new ArrayList<>();
    tableLights.add(new TableLight());
    tableLights.add(new TableLight());
    tableLights.add(new TableLight());

    List<FlashLight> flashLights = new ArrayList<>();
    flashLights.add(new FlashLight());
    flashLights.add(new FlashLight());
    flashLights.add(new FlashLight());

    List<Light> lights = new ArrayList<>();
    Light light = new FlashLight(); // Upcast
    lights.add(light);
    lights.add(new FlashLight()); // Upcast
    lights.add(new TableLight()); // Upcast
    lights.add(new TableLight()); // Upcast
    lights.add(new FlashLight()); // Upcast
    lights.add(new TableLight()); // Upcast

    List<Light> lights2 = List.of(new TableLight(), new FlashLight(), new FlashLight());

    ArrayList<WiredDevice> devices = new ArrayList<>();
    devices.add(new Toaster());
    devices.add(new TableLight());

    /* Ansatz ohne Vererbung */
    for (TableLight t : tableLights) {
      t.switchOn();
      t.plugIn();
      System.out.println(t);
    }

    for (FlashLight f : flashLights) {
      f.switchOn();
      f.recharge();
      System.out.println(f);
    }

    System.out.println();

    /* Ansatz mit Vererbung */
    for (Light l : lights) {
      l.switchOn(); // (Dynamische) Polymorphie
      // bis Java 16
      if (l instanceof TableLight) {
        TableLight t = (TableLight) l; // Downcast
        t.plugIn();
      }
      // seit Java 16
      if (l instanceof FlashLight f) { // Downcast
        f.recharge();
      }
      System.out.println(l);
      l.switchOff();
    }

  }

}
