package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Task.
 */
public class FI {
    public static void main(String[] args) {
        String[] str = {
                "Mariya", "Anna", "Luiza"
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
        };
        Arrays.sort(str, cmpDescSize);
    }
}