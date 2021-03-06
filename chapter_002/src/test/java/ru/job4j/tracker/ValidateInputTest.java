package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Test.
 * @version $Id$
 * @since 0.1
 */
public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    /**
     * Тест-метод сравнивает ответ ValidateInput и ожидаемый результат.
     */
    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "3"})
        );
        input.ask("Enter", new int[] {3});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Пожалуйста, введите корректное значение ещё раз.%n")
                )
        );
    }

    /**
     * Тест-метод сравнивает ответ ValidateInput и ожидаемый результат.
     */
    @Test
    public void whenInputIsOutOfRange() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"5", "1"})
        );
        input.ask("Enter", new int[] {1, 2, 3, 4});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Пожалуйста, выберите значение из диапазона меню.%n")
                )
        );
    }
}
