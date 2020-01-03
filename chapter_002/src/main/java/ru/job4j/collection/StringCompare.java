package ru.job4j.collection;

import java.util.Comparator;
import static java.lang.Math.min;

/**
 * Task.
 */
public class StringCompare implements Comparator<String> {

    /**
     * Метод реализует компаратор для сравнения двух массивов символов.
     * Реализовано поэлементное сравнение двух списков, т.е. сравниваем
     * элементы двух списков, находящиеся на одних и тех же позициях (по одним и тем же индексам).
     * @param left массив символов.
     * @param right массив символов.
     * @return результат сравнения.
     */
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int lengthMin = min(left.length(), right.length());
        for (int index = 0; index != lengthMin; index++) {
            result = Integer.compare(left.charAt(index), right.charAt(index));
            if (result != 0) {
                return result;
            }
        }
        if (left.length() != right.length()) {
            result = left.length() - right.length();
        }
        return result;
    }
}