package de.neuefische.animals;

public class Dog implements Animal {
    private String sound = "WUFF";

    public String getSound() {
        return sound;
    }

    public void move() {
        System.out.println("Goes to tree.");
    }

    public void protectHouse(){
        System.out.println("Scares burgler.");
    }
}
