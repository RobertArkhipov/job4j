package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {

    /**
     * Метод toArray равномерно разбивает лист на количество строк двумерного массива.
     * При этом, если количество элементов не кратно количеству строк,
     * то оставшиеся значения в массиве заполняются нулями.
     * @param list список целочисленных элементов.
     * @param rows количество строк двумерного массива.
     * @return двумерный массив.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int count = 0;
        int[][] array = new int[rows][cells];
        for (int line = 0; line < rows; line++) {
            for (int col = 0; col < cells; col++) {
                array[line][col] = list.get(count);
                if (count < list.size() - 1) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return array;
    }
}