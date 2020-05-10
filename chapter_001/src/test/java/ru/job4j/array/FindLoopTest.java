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

    /**
     * Тест. Если искомый элемент присутствует в массиве в указанном диапазоне.
     */
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    /**
     * Тест. Если искомый элемент отсутствует в массиве в указанном диапазоне.
     */
    @Test
    public void whenNotFound() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 4;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}