package ru.job4j.array;

/**
 * Программа для сортировки массива методом перестановки.
 */
public class BubbleSort {

    /**
     * Метод сортирует массив целых чисел, используя алгоритм сортировки "пузырьком".
     * @param array массив неотсортированных целых чисел.
     * @return массив отсортированных целых чисел.
     */
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int index = 0; index < array.length - i; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
}