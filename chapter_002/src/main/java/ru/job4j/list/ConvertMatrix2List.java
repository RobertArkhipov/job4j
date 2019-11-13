package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {

    /**
     * В метод приходит двумерный массив целых чисел;
     * проходим по всем элементам массива и добавляем их в List<Integer>.
     * @param array двумерный массив целых чисел.
     * @return список целочисленных элементов.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int column : row) {
                list.add(column);
            }
        }
        return list;
    }
}
