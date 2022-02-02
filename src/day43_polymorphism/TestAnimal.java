package day43_polymorphism;

public class TestAnimal {
    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Animal();
        Animal c = new Animal();

        Animal animal = new Animal();
        animal = new Dog();
        animal = new Bird();



    }
}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}
