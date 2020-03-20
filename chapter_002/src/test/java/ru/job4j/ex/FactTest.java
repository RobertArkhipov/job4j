package ru.job4j.ex;

import org.junit.Test;

/**
 * Test.
 */
public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNIsLessThanOne() {
        Fact fact = new Fact();
        fact.calc(-1);
    }
}
