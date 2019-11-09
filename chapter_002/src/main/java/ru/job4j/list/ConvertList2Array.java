package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {

    /**
     * Метод toArray равномерно разбивает лист на количество строк двумерного массива.
     * При этом, если количество элементов не кратно количеству строк,
     * то оставшиеся значения в массиве заполняются нулями.
     *
     * @param list список целочисленных элементов.
     * @param rows количество строк двумерного массива.
     * @return двумерный массив.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int row = 0;
        int column = 0;
        for (int varList : list) {
            array[row][column] = varList;
            if (column == cells - 1) {
                row++;
            }
            if (column < cells - 1) {
                column++;
            } else {
                column = 0;
            }
        }
        return array;
    }
}