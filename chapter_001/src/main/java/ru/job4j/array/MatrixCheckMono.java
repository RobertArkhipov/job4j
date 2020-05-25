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

    /**
     * Метод проверяет, что колонка в двухмерном массиве целиком заполнена символом 'X'.
     * @param board двухмерный массив символов.
     * @param column колонка, которую необходимо проверить.
     * @return true or false.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}