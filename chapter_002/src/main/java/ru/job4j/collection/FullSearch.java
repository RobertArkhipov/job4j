package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * Task.
 */
public class FullSearch {

    /**
     * Метод оставляет уникальные номера задач, убирая дубликаты.
     * @param list список задач.
     * @return список уникальных номеров задач.
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task value : list) {
            numbers.add(value.getNumber());
        }
        return numbers;
    }
}