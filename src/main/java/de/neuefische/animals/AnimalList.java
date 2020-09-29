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
    /*
    Schreibe eine Klasse AnimalListItem mit
einer variable value von Type Animal
einer variable next von Typ AnimalListItem
einem Konstruktor mit value als Parameter
eine Methode add die ein Element ans ende anhängt
schreibe eine Methode welche die Liste wenn sie
die Elemente a,b und c enthält wie folgt als String zurückgibt “a -> b -> c”


Implementiere eine Methode remove welche alle Elemente mit einem entsprechenden Wert entfernt.
Schreibe entsprechende Tests

     */
    public void removeAnimal(Animal animal) {

    }
}
