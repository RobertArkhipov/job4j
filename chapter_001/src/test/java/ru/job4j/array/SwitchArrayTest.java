package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 */
public class SwitchArrayTest {

    /**
     * Меняем местами первый и четвёртый элементы массива.
     */
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    /**
     * Меняем местами второй и третий элементы массива.
     */
    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }

    /**
     * Меняем сам на себя четвёртый элемент массива.
     */
    @Test
    public void whenSwap3to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, 3, 3);
        assertThat(rsl, is(expect));
    }
}