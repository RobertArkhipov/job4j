package ru.job4j.array;

/**
 * Task: Объединить два массива.
 */
public class ArraysUnited {

    /**
     * Метод берет элементы двух массивов и добавляет в третий массив.
     * @param left отсортированный массив a.
     * @param right отсортированный массив b.
     * @return отсортированный массив.
     */
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int counter = 0;
        int a = 0;
        int b = 0;
        for (; a < left.length || b < right.length;) {
            if (a < left.length && b < right.length) {
                if (left[a] < right[b]) {
                    result[counter] = left[a];
                    a++;
                } else {
                    result[counter] = right[b];
                    b++;
                }
            } else if (a < left.length) {
                result[counter] = left[a];
                a++;
            } else if (b < right.length) {
                result[counter] = right[b];
                b++;
            }
            counter++;
        }
        return result;
    }
}
