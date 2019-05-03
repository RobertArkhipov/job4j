package ru.job4j.loop;

/**
 * Программа вычисляющая факториал.
 */
public class Factorial {

    /**
     * Метод рассчитывает факториал для целого положительного числа.
     * @param n положительное целое число.
     * @return факториал числа.
     */
    public int calc(int n) {
        int result = 1;
        for (int start = 1; start <= n; start++) {
            result = result * start;
        } return result;
    }
}