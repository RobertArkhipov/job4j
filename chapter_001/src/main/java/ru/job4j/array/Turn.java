package ru.job4j.array;

/**
 * Программа переворачивает массив задом наперёд.
 */
public class Turn {

    /**
     * Метод принимает в себя массив, а возвращает тот же самый массив, но перевёрнутый задом наперёд.
     * @param array массив целых чисел.
     * @return массив.
     */
    public int[] back(int[] array) {
        for (int index = 0; index != array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}