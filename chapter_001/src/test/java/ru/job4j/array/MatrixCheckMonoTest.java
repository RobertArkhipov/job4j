package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class MatrixCheckMonoTest {

    /**
     * Тест-метод добавляет двухмерный массив символов в метод MatrixCheckMono.monoHorizontal,
     * и сравнивает с ожидаемым результатом. Ожидается утвердительный ответ: - искомая строка заполнена символом 'X'.
     */
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheckMono.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    /**
     * Тест-метод добавляет двухмерный массив символов в метод MatrixCheckMono.monoVertical,
     * и сравнивает с ожидаемым результатом. Ожидается утвердительный ответ: - искомый столбец заполнен символом 'X'.
     */
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheckMono.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    /**
     * Тест-метод добавляет двухмерный массив символов в метод MatrixCheckMono.extractDiagonal,
     * и сравнивает с ожидаемым результатом. Ожидается одномерный массив заполненный элементами диагонали двухмерного массива.
     */
    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheckMono.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    /**
     * Тест-метод добавляет двухмерный массив символов в метод MatrixCheckMono.isWin,
     * и сравнивает с ожидаемым результатом. Ожидается утвердительный ответ: - в двухмерном массиве
     * найден столбец заполненный символом 'X'
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheckMono.isWin(input);
        assertThat(result, is(true));
    }

    /**
     * Тест-метод добавляет двухмерный массив символов в метод MatrixCheckMono.isWin,
     * и сравнивает с ожидаемым результатом. Ожидается отрицательный ответ: - в двухмерном массиве
     * не найдены ни строка ни столбец заполненные символом 'X'
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheckMono.isWin(input);
        assertThat(result, is(false));
    }

    /**
     * Тест-метод добавляет двухмерный массив символов в метод MatrixCheckMono.isWin,
     * и сравнивает с ожидаемым результатом. Ожидается утвердительный ответ: - в двухмерном массиве
     * найдена строка заполненная символом 'X'
     */
    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheckMono.isWin(input);
        assertThat(result, is(true));
    }
}