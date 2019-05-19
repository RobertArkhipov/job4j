package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class ArraysUnitedTest {

    /**
     * Тест-метод сравнивает отсортированный массив, и ожидаемый результат.
     */
    @Test
    public void whenAAndBThenExpectArray() {
        ArraysUnited united = new ArraysUnited();
        int[] a = {1, 2, 3, 1000};
        int[] b = {500, 600, 700};
        int[] resultArray = united.merge(a, b);
        int[] expectArray = {1, 2, 3, 500, 600, 700, 1000};
        assertThat(resultArray, is(expectArray));
    }
}
