package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Robert Arkhipov (s34s@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {

    /**
     * Тест, при котором второе число максимальное (проверяются 2 числа).
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Тест, при котором первое число максимальное (проверяются 2 числа).
     */
    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    /**
     * Тест, при котором первое число максимальное (проверяются 3 числа).
     */
    @Test
    public void whenMax5Or1Or2Then5() {
        Max max = new Max();
        int result = max.max(5, 1, 2);
        assertThat(result, is(5));
    }

    /**
     * Тест, при котором третье число максимальное (проверяются 4 числа).
     */
    @Test
    public void whenMax1Or4Or7Or5Then5() {
        Max max = new Max();
        int result = max.max(1, 4, 7, 5);
        assertThat(result, is(7));
    }

    /**
     * Тест, при котором оба числа одинаковые (проверяются 2 числа).
     */
    @Test
    public void whenMax1To1Then1() {
        Max max = new Max();
        int result = max.max(1, 1);
        assertThat(result, is(1));
    }

    /**
     * Тест, при котором все числа одинаковые (проверяются 3 числа).
     */
    @Test
    public void whenMax1Or1Or1Then1() {
        Max max = new Max();
        int result = max.max(1, 1, 1);
        assertThat(result, is(1));
    }

    /**
     * Тест, при котором все числа одинаковые (проверяются 4 числа).
     */
    @Test
    public void whenMax3Or3Or3Or3Then3() {
        Max max = new Max();
        int result = max.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }
}