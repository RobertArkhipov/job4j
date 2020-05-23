package ru.job4j.array;

/**
 * Task.
 */
public class SortSelected {

    /**
     * Метод sort осуществляет сортировку методом выборки.
     * @param data массив чисел, который нужно отсортировать по возрастанию.
     * @return отсортированный массив.
     */
    public static int[] sort(int[] data) {
        for (int start = 0; start < data.length; start++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = FindLoop.indexOf(data, min, start, data.length - 1);
            int swap = data[start];
            data[start] = data[index];
            data[index] = swap;
        }
        return data;
    }
}