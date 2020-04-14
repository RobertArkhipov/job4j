package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class RangeFunctionTest {

    /**
     * Проверка метода подсчета функции в диапазоне. Проверяем линейную функцию.
     */
    @Test
    public void whenLinearFunction() {
        List<Double> result = RangeFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    /**
     * Проверка метода подсчета функции в диапазоне. Проверяем квадратичная функцию.
     */
    @Test
    public void whenQuadraticFunction() {
        List<Double> result = RangeFunction.diapason(5, 8, x -> Math.pow(x, 2) + x + 1);
        List<Double> expected = Arrays.asList(31D, 43D, 57D);
        assertThat(result, is(expected));
    }

    /**
     * Проверка метода подсчета функции в диапазоне. Проверяем показательную функцию.
     */
    @Test
    public void whenExponentialFunction() {
        List<Double> result = RangeFunction.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}
