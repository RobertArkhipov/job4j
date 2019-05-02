package ru.job4j.loop;

/**
 * Программа для подсчета суммы чётных чисел в диапазоне.
 */
public class Counter {

    /**
     * Метод вычисляет сумму чётных чисел в диапазоне от start до finish.
     * @param start начальное число.
     * @param finish конечное число.
     * @return сумма.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
        } return sum;
    }
}