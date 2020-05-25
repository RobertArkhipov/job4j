package ru.job4j.array;

/**
 * Task.
 */
public class MatrixCheckMono {

    /**
     * Метод проверяет, что строка в двухмерном массиве целиком заполнена символом 'X'.
     * @param board двухмерный массив символов.
     * @return true or false.
     */
    public static boolean monoHorizontal(char[][] board) {
        boolean result = false;
        for (int line = 0; line < board.length; line++) {
            for (int col = 0; col < board.length; col++) {
                if (board[line][col] == 'X') {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}