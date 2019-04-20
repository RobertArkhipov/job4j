package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Robert Arkhipov (s34s@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
 /**
 * Test echo.
 */

@Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Robert Arkhipov";
    String expect = "Echo, echo, echo : Robert Arkhipov"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is (expect));

 }

}