package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
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

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(new PrintStream(this.stdout));
        System.out.println("execute after method");
    }

    /**
     * Тест-метод печатает псевдокартинку (квадрат) на консоль и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenDrawSquare() {
        String ln = System.lineSeparator();
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
    }

    /**
     * Тест-метод печатает псевдокартинку (треугольник) на консоль и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenDrawTriangle() {
        String ln = System.lineSeparator();
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
    }
}