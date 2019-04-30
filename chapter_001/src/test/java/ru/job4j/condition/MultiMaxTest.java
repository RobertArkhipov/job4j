package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Robert Arkhipov (s34s@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class MultiMaxTest {

    /**
     * Тест-метод с проверкой: первое число максимальное.
     */
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 2, 1);
        assertThat(result, is(4));
    }

    /**
     * Тест-метод с проверкой: второе число максимальное.
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Тест-метод с проверкой: третье число максимальное.
     */
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }

    /**
     * Тест-метод с проверкой: все числа одинаковые.
     */
    @Test
    public void whenAllNumbersAreEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 1, 1);
        assertThat(result, is(1));
    }
}