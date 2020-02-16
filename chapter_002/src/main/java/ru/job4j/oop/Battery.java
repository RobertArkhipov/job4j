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
        int necessary = 100 - another.load;
        if (this.load > necessary) {
            this.load -= necessary;
            another.load += necessary;
        } else {
            another.load += this.load;
            this.load = 0;
        }
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(95);
        System.out.println("first: " + first.load + ", second: " + second.load);
        first.exchange(second);
        System.out.println("first: " + first.load + ", second: " + second.load);
    }
}
