package ru.job4j.array;

/**
 * Task: Квадратный массив заполнен true или false по диагоналям.
 */
public class MatrixCheck {

    /**
     * Метод проверяет, что все элементы по диагоналям равны true или false.
     * @param data квадратный массив.
     * @return true или false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i][i] != data[i + 1][i + 1])
                    || data[data.length - 1 - i][i] != data[data.length - 1 - (i + 1)][i + 1]) {
                result = false;
            }
        }
        return result;
    }
}