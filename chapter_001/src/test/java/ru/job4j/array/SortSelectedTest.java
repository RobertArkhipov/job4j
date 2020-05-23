package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class SortSelectedTest {

    /**
     * Тест-метод добавляет массив из пяти чисел в метод findMin,
     * и сравнивает с ожидаемым результатом. Ожидается,
     * отсортированный по возрастанию массив.
     */
    @Test
    public void whenSortFive() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    /**
     * Тест-метод добавляет массив из трёх чисел в метод findMin,
     * и сравнивает с ожидаемым результатом. Ожидается,
     * отсортированный по возрастанию массив.
     */
    @Test
    public void whenSortThree() {
        int[] input = new int[] {8, 5, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 5, 8};
        assertThat(result, is(expect));
    }
}