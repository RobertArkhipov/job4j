package ru.job4j.array;

/**
 * Task.
 */
public class MinDiapason {

    /**
     * Метод находит минимальное число в массиве в диапазоне индексов.
     * @param array массив чисел.
     * @param start начальный индекс.
     * @param finish конечный индекс.
     * @return минимальное число.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}