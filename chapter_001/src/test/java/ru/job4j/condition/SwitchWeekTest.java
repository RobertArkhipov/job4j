package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchWeekTest {

    @Test
    public void whenIs5() {
        String rsl = SwitchWeek.nameOfDay(5);
        assertThat(rsl, is("Пятница"));
    }

    @Test
    public void whenIsError() {
        String rsl = SwitchWeek.nameOfDay(9);
        assertThat(rsl, is("Ошибка"));
    }
}
