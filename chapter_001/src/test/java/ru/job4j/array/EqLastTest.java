package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static ru.job4j.array.EqLast.check;

import org.junit.Test;

/**
 * Test.
 */
public class EqLastTest {

    /**
     * Тест. Когда последние элементы у массивов равны.
     */
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(check(left, right), is(true));
    }

    /**
     * Тест. Когда последние элементы у массивов не равны.
     */
    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(check(left, right), is(false));
    }
}