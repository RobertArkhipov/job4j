package ru.job4j.condition;

/**
 * Программа для нахождения максимума из двух чисел.
 */
public class Max {

    /**
     * Метод max возвращает максимальное число из left и right.
     * @param left первое проверяемое число.
     * @param right второе проверяемое число.
     * @return максимальное число.
     */
    public int max(int left, int right) {
        return left < right ? right : left;
    }
}