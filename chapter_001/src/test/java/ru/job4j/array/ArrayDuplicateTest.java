package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class ArrayDuplicateTest {

    /**
     * Тест, проверяющий удаление дубликатов строк из массива строк.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] resultArray = duplicate.remove(array);
        String[] expectArray = {"Привет", "Мир", "Супер"};
        assertThat(resultArray, is(expectArray));
    }
}