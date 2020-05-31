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

    /**
     * Метод заполняет одномерный массив элементами диагонали из двухмерного массива.
     * @param board двухмерный массив символов.
     * @return одномерный массив.
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    /**
     * Метод проверяет, что в квадратном массиве есть строчки или столбцы, заполненные только символом 'X'
     * @param board двухмерный массив символов.
     * @return true or false.
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (monoHorizontal(board, index) || monoVertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }
}