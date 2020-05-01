package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class MatrixTest {

    /**
     * Тест-метод сравнивает ответ метода Matrix.convert и ожидаемый результат.
     * Ожидается преобразование матрицы чисел в список чисел.
     */
    @Test
    public void whenConvertMatrixOfNumbersToListOfNumbers() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        List<Integer> result = Matrix.convert(matrix);
        assertThat(result.get(3), is(4));
    }
}
