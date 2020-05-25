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
     * и сравнивает с ожидаемым результатом. Ожидается нахождение строки целиком заполненной символом 'X'.
     */
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheckMono.monoHorizontal(input);
        assertThat(result, is(true));
    }
}