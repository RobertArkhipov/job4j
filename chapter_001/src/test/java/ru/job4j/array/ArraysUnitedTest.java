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
        int[] a = {1, 3, 5};
        int[] b = {2, 3, 4};
        int[] resultArray = united.merge(a, b);
        int[] expectArray = {1, 2, 3, 3, 4, 5};
        assertThat(resultArray, is(expectArray));
    }
}
