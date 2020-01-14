package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 */
public class UniqueTextTest {

    /**
     * Тест-метод проверяет метод isEquals класса UniqueText. Ожидается корректное
     * сравнение двух текстов на уникальность.
     */
    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    /**
     * Тест-метод проверяет метод isEquals класса UniqueText. Ожидается корректное
     * сравнение двух текстов на уникальность.
     */
    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
}