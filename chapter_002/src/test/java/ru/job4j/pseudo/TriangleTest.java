package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {

    /**
     * Тест-метод формирует псевдокартинку (треугольник) и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        String ln = System.lineSeparator();
        assertThat(
                triangle.draw(), is(new StringBuilder()
                        .append("*")
                        .append(ln)
                        .append("**")
                        .append(ln)
                        .append("***")
                        .append(ln)
                        .append("****")
                        .toString()
                )
        );
    }
}