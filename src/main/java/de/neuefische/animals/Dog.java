package de.neuefische.animals;

public class Dog extends Animal {

    public Dog(){
        super("WUFF");
    }
  /*  public String getSound() {
        return sound;
    }
*/
    public void move() {
        System.out.println("Goes to tree.");
    }

    public void protectHouse(){
        System.out.println("Scares burglar.");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
