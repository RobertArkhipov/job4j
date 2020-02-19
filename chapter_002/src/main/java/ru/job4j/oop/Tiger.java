package ru.job4j.oop;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("load Tiger");
    }

    public Tiger(String name) {
        super(name);
        System.out.println("Tiger");
    }

    public static void main(String[] args) {
        Tiger tigerFirst = new Tiger();
        Tiger tigerSecond = new Tiger("Amur");
    }
}