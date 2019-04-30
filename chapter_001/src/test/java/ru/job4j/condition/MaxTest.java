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
     * Тест-методы с проверками: второе число максимальное, первое число максимальное, оба числа одинаковые.
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To1Then1() {
        Max max = new Max();
        int result = max.max(1, 1);
        assertThat(result, is(1));
    }
}