package ru.job4j.array;

/**
 * Программа определяет, заполнен ли массив одинаковыми значениями.
 */
public class Check {

    /**
     * Метод проверяет, что все элементы в массиве являются true или false.
     * @param data массив.
     * @return true или false.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index != data.length - 1; index++) {
            if (data[index] != data[index + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
