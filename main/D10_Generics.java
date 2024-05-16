package main;

import model.GenericBox;
import model.IntegerBox;
import model.StringBox;

/**
 * Generische Programmierung mit Java Generics
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D10_Generics {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    IntegerBox integerBox = new IntegerBox();
    integerBox.setContentA(4);
    integerBox.setContentB(7);

    int int1 = integerBox.getContentA();
    int int2 = integerBox.getContentB();

    StringBox stringBox = new StringBox();
    stringBox.setContentA("Hans");
    stringBox.setContentB("Peter");

    String string1 = stringBox.getContentA();
    String string2 = stringBox.getContentB();

    GenericBox<Integer, String> genericBox = new GenericBox<>();
    genericBox.setContentA(4);
    genericBox.setContentB("Peter");

    int int3 = genericBox.getContentA();
    String string3 = genericBox.getContentB();

  }

}
