package ru.job4j.pseudo;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {

    /**
     * Тест-метод печатает псевдокартинку (квадрат) на консоль и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenDrawSquare() {
        String ln = System.lineSeparator();
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append(ln)
                                .append("+     +")
                                .append(ln)
                                .append("+     +")
                                .append(ln)
                                .append("++++")
                                .append(ln)
                                .toString()
                )
        );
        System.setOut(stdout);
    }

    /**
     * Тест-метод печатает псевдокартинку (треугольник) на консоль и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenDrawTriangle() {
        String ln = System.lineSeparator();
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                        .append("*")
                        .append(ln)
                        .append("**")
                        .append(ln)
                        .append("***")
                        .append(ln)
                        .append("****")
                        .append(ln)
                        .toString()
                )
        );
        System.setOut(stdout);
    }
}