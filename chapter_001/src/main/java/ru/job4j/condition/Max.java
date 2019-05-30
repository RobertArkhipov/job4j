package ru.job4j.condition;

/**
 * Программа для нахождения максимума из нескольких чисел.
 */
public class Max {

    /**
     * Метод max возвращает максимальное число из first и second.
     * @param first первое проверяемое число.
     * @param second второе проверяемое число.
     * @return максимальное число.
     */
    public int max(int first, int second) {
        return first < second ? second : first;
    }

    /**
     * Метод max возвращает максимальное число из first, second и third.
     * @param first первое проверяемое число.
     * @param second второе проверяемое число.
     * @param third третье проверяемое число.
     * @return максимальное число.
     */
    public int max(int first, int second, int third) {
        int tmp = max(second, third);
        return max(first, tmp);
    }

    /**
     * Метод max возвращает максимальное число из first, second, third и fourth.
     * @param first первое проверяемое число.
     * @param second второе проверяемое число.
     * @param third третье проверяемое число.
     * @param fourth четвёртое проверяемое число.
     * @return максимальное число.
     */
    public int max(int first, int second, int third, int fourth) {
        int tmp = max(second, third, fourth);
        return max(first, tmp);
    }
}