package de.neuefische.animals;

public class AppMain {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog dog2 = new Dog();
        Animal bird = new Bird();

        Animal[] animals = new Animal[]{dog, dog2, bird};

        for (Animal animal : animals) {
            printSound(animal);
            animal.move();
        }
    }

    public static void printSound(Animal animal) {
        System.out.println(animal.getSound());
    }
}
