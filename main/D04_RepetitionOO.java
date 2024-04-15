package main;

import java.util.ArrayList;
import model.Pet;

public class D04_RepetitionOO {

  public static void main(String[] args) {

    ArrayList<Pet> pets = new ArrayList<>();

    Pet pet1 = new Pet("Max", "Hund", 3, 0.5);
    Pet pet2 = new Pet("Moritz", "Katze", 1, 0.25);

    pets.add(pet1);
    pets.add(pet2);

    for (Pet p : pets) {
      p.eat();
      p.move();
      System.out.println(p); // System.out.println(p.toString());
    }

    System.out.println();

    System.out.println(pets);

  }

}
