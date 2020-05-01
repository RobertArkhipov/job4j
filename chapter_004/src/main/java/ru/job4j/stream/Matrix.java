package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Task.
 */
public class Matrix {

    public static List<Integer> convert(List<List<Integer>> matrix) {
        return matrix.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
