package de.neuefische.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {


    @Test
    void addAnimal() {
        // given
        Animal animal1 = new Dog();
        Animal animal2 = new Bird();

        AnimalList list = new AnimalList(animal1);

        // when
        list.addAnimal(animal2);

        // then
        assertEquals(animal2, list.getNext().getAnimal());
    }


    @Test
    void toStringAnimal() {
        // given
        Animal animal1 = new Dog();
        Animal animal2 = new Bird();

        AnimalList list = new AnimalList(animal1);
        list.addAnimal(animal2);

        String expected = "Dog->Bird";

        // when
        String actual = list.toString();

        // then
        assertEquals(expected, actual);
    }



}