package ru.job4j.array;

/**
 * Task.
 */
public class MatrixCheckMono {

    /**
     * Метод проверяет, что строка в двухмерном массиве целиком заполнена символом 'X'.
     * @param board двухмерный массив символов.
     * @param row строка, которую необходимо проверить.
     * @return true or false.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}