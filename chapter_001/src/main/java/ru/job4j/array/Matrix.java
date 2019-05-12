package ru.job4j.array;

/**
 * Task: Двухмерный массив. Таблица умножения.
 */
public class Matrix {

    /**
     * Метод записывает элементы таблицы умножения, в элементах таблицы.
     * @param size размер таблицы.
     * @return двухмерный массив.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i != table.length; i++) {
            for (int j = 0; j != table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}