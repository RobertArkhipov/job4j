package ru.job4j.loop;

/**
 * Программа для построения шахматной доски в псевдографике.
 */
public class Board {

    /**
     * Метод рисует шахматную доску из символов x и пробелов.
     * @param width ширина доски.
     * @param height высота доски.
     * @return возвращает шахматную доску в виде строки.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            } screen.append(ln);
        } return screen.toString();
    }
}