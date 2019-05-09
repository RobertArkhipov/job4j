package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class FindLoopTest {

    /**
     * Тест. Когда искомый элемент присутствует в массиве.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Тест. Если искомый элемент отсутствует в массиве.
     */
    @Test
    public void whenTheArrayDoesNotHave7ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{2, 6, 3, 5, 8};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}