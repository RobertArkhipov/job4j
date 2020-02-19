package ru.job4j.oop;

/**
 * Task.
 */
public class Animal {
    String name;

    public Animal() {
        System.out.println("load Animal");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}