package ru.job4j.array;

/**
 * Task: 6.6.3. Двухмерный массив. If. [#306727]
 */
public class SkipNegative {

    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array.length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}