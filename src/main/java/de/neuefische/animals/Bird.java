package de.neuefische.animals;

public class Bird extends Animal{

    private boolean migratoryBird = true;
    public Bird(){
        super("Piep piep");
    }
/*
    public String getSound() {
        return sound;
    }
*/
    public void move() {
        System.out.println("Flies around town.");
    }

    public boolean isMigratoryBird() {
        return migratoryBird;
    }
}
