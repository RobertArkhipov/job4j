package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class DefragmentTest {

    /**
     * Тест-метод добавляет строковый массив символов, состоящий из двух ячеек, в метод Defragment.compress,
     * и сравнивает с ожидаемым результатом. Ожидается отсортированный массив,
     * в котором заполненная ячейка массива расположена в начале, а пустая в конце.
     */
    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", null};
        assertThat(compressed, is(expected));
    }

    /**
     * Тест-метод добавляет строковый массив символов, состоящий из семи ячеек, где первая ячейка не пустая,
     * в метод Defragment.compress, и сравнивает с ожидаемым результатом. Ожидается отсортированный массив,
     * в котором заполненные ячейки массива расположены в начале, а пустые в конце.
     */
    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    /**
     * Тест-метод добавляет строковый массив символов, состоящий из семи ячеек, где первая ячейка пустая,
     * в метод Defragment.compress, и сравнивает с ожидаемым результатом. Ожидается отсортированный массив,
     * в котором заполненные ячейки массива расположены в начале, а пустые в конце.
     */
    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    /**
     * Тест-метод добавляет строковый массив символов, состоящий из трёх ячеек, где все ячейки пустые,
     * в метод Defragment.compress, и сравнивает с ожидаемым результатом. Ожидается массив пустых ячеек.
     */
    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {null, null, null};
        assertThat(compressed, is(expected));
    }

    /**
     * Тест-метод добавляет строковый массив символов, состоящий из семи ячеек, где первые три ячейки пустые,
     * в метод Defragment.compress, и сравнивает с ожидаемым результатом. Ожидается отсортированный массив,
     * в котором заполненные ячейки массива расположены в начале, а пустые в конце.
     */
    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}