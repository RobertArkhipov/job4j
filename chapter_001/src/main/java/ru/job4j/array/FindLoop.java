package ru.job4j.array;

/**
 * Программа для поиска элемента в массиве.
 */
public class FindLoop {

    /**
     * Метод для поиска элемента, подходящего под условие.
     * @param data массив элементов.
     * @param el элемент, который необходимо найти.
     * @return индекс элемента.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод для поиска элемента в указанном диапазоне.
     * @param data массив элементов.
     * @param el элемент, который необходимо найти.
     * @param start индекс, с которого начинаем поиск.
     * @param finish индекс, которым заканчиваем поиск.
     * @return индекс элемента.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}