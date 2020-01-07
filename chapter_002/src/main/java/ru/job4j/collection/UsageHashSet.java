package ru.job4j.collection;

import java.util.HashSet;

/**
 * Task.
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        autos.add("BMW");
        for (Object auto: autos) {
            System.out.println(auto);
        }
    }
}