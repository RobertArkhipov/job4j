package ru.job4j.array;

/**
 * Программа заполняющая массив числами, возведенными в квадрат.
 */
public class Square {

    /**
     * Метод заполняет массив через цикл, элементами от 1 до bound, возведенными в квадрат.
     * @param bound количество элементов массива.
     * @return массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        } return rst;
    }
}