package ru.job4j.loop;

/**
 * Программа для построения пирамиды в псевдографике.
 */
public class Paint {

    /**
     * Метод рисует пирамиду из символов x и пробелов.
     * @param height высота пирамиды.
     * @return возвращает пирамиду в виде строки.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Метод рисует правую часть пирамиды из символов x и пробелов.
     * @param height высота пирамиды.
     * @return возвращает правую часть пирамиды в виде строки.
     */
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Метод рисует левую часть пирамиды из символов x и пробелов.
     * @param height высота пирамиды.
     * @return возвращает левую часть пирамиды в виде строки.
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}