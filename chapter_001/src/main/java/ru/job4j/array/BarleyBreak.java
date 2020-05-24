package ru.job4j.array;

/**
 * Task.
 */
public class BarleyBreak {

    public static void main(String[] args) {
        int value = 1;
        int[][] array = new int[3][3];
        for (int line = 0; line < 3; line++) {
            for (int col = 0; col < 3; col++) {
                array[line][col] = value;
                System.out.println(array[line][col]);
                value++;
            }
        }
    }
}
