package ru.job4j.oop;

/**
 * Task.
 */
public class Battery {
    private int load;

    public Battery(int value) {
        this.load = value;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(40);
        Battery second = new Battery(30);
        System.out.println("first: " + first.load + ", second: " + second.load);
        first.exchange(second);
        System.out.println("first: " + first.load + ", second: " + second.load);
    }
}