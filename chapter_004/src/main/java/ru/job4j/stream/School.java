package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Task.
 */
public class School {

    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(
                predict).collect(Collectors.toList());
    }

    public static Map map(List<Student> students) {
        return students.stream().collect(
                Collectors.toMap(
                        student -> student.getSurname(),
                        student -> student.getScore()
                ));
    }
}