package ru.job4j.condition;

/**
 * Программа для нахождения максимума из трёх чисел.
 */
public class MultiMax {

    /**
     * Метод max возвращает максимальное число из first, second и third.
     * @param first первое проверяемое число.
     * @param second второе проверяемое число.
     * @param third третье проверяемое число.
     * @return максимальное число.
     */
    public int max(int first, int second, int third) {
        int result = first < second ? second : first;
        return result < third ? third : result;
    }
}