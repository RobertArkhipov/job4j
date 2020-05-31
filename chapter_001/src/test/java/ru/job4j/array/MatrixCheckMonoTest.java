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
}