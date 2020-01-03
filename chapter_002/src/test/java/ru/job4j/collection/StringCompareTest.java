package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 */
public class StringCompareTest {

    /**
     * Когда оба массива имеют одинаковый набор символов.
     * Тест-метод сравнивает ответ метода compare и ожидаемый результат.
     */
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    /**
     * Когда первый массив меньше второго.
     * Тест-метод сравнивает ответ метода compare и ожидаемый результат.
     */
    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    /**
     * Когда первый массив больше второго.
     * Тест-метод сравнивает ответ метода compare и ожидаемый результат.
     */
    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    /**
     * Когда второй символ первого массива больше второго символа правого массива.
     * Тест-метод сравнивает ответ метода compare и ожидаемый результат.
     */
    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    /**
     * Когда второй символ первого массива меньше второго символа правого массива.
     * Тест-метод сравнивает ответ метода compare и ожидаемый результат.
     */
    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }

    /**
     * Когда оба массива символов пустые.
     * Тест-метод сравнивает ответ метода compare и ожидаемый результат.
     */
    @Test
    public void whenStringsAreEmptyThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "",
                ""
        );
        assertThat(rst, is(0));
    }

    /**
     * Когда первый массив содержит символы, а второй массив пустой.
     * Тест-метод сравнивает ответ метода compare и ожидаемый результат.
     */
    @Test
    public void whenRightLessThanLeft() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "123",
                ""
        );
        assertThat(rst, greaterThan(0));
    }

    /**
     * Когда первый массив пустой, а второй содержит символы.
     * Тест-метод сравнивает ответ метода compare и ожидаемый результат.
     */
    @Test
    public void whenLeftLessThanRight() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }
}