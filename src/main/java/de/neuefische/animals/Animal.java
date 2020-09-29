package de.neuefische.animals;

public abstract class Animal {
    public Animal(String sound) {
        this.sound = sound;
    }

    private String sound;

    public String getSound(){
        return sound;
    }
   abstract void move();
}
