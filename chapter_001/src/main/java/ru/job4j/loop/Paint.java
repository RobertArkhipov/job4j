package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Программа для построения пирамиды в псевдографике.
 */
public class Paint {

    /**
     * Метод рисует правую часть пирамиды из символов x и пробелов.
     * @param height высота пирамиды.
     * @return возвращает правую часть пирамиды в виде строки.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Метод рисует левую часть пирамиды из символов x и пробелов.
     * @param height высота пирамиды.
     * @return возвращает левую часть пирамиды в виде строки.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Метод рисует пирамиду из символов x и пробелов.
     * @param height высота пирамиды.
     * @return возвращает пирамиду в виде строки.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
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