package de.neuefische.animals;

public class Bird implements Animal{

    private String sound = "Piep piep";
    private boolean migratoryBird = true;

    public String getSound() {
        return sound;
    }

    public void move() {
        System.out.println("Flies around town.");
    }

    public boolean isMigratoryBird() {
        return migratoryBird;
    }
}
