package de.neuefische.animals;

import java.util.Objects;

public class AnimalList {

    private Animal animal;
    private AnimalList next;

    public AnimalList(Animal animal) {
        this.animal = animal;
    }

    public AnimalList getNext() {
        return next;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalList that = (AnimalList) o;
        return Objects.equals(animal, that.animal) &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal, next);
    }

    public void addAnimal(Animal animal) {
        if(next == null) {
            next = new AnimalList(animal);
        } else{
            next.addAnimal(animal);
        }

    }

    public void removeAnimal(Animal animal) {

    }

    @Override
    public String toString() {
        if(next == null) {

            return animal.toString();
        }
        String out = "";
        out+= animal.toString();
        out+="->";
        out+= next.toString();
        return out;
    }
}
