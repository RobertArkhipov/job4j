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
        for (int a = 0; a < left.length; a++) {
            if (left[a] < right[a]) {
                result[a + a] = left[a];
                result[a + a + 1] = right[a];
            } else {
                result[a + a] = right[a];
                result[a + a + 1] = left[a];
            }
        }
        return result;
    }
}