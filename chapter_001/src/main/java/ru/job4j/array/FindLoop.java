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
}