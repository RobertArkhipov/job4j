package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class JobTest {

    /**
     * Тест-метод отправляет 2 параметра в метод compare класса JobDescByName,
     * и сравнивает с ожидаемым результатом. Ожидается корректное
     * сравнение полей имени (для сортировки по убыванию).
     */
    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Task1", 0),
                new Job("Task2", 0)
        );
        assertThat(rsl, is(1));
    }

    /**
     * Тест-метод отправляет 2 параметра в метод compare класса JobDescByPriority,
     * и сравнивает с ожидаемым результатом. Ожидается корректное
     * сравнение полей приоритета (для сортировки по убыванию).
     */
    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("Task1", 1),
                new Job("Task2", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * Тест-метод проверяет комбинированную сортировку
     * по полям имени и приоритета (по убыванию).
     */
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * Тест-метод проверяет комбинированную сортировку
     * по полям приоритета и имени (по убыванию).
     */
    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Task1", 1),
                new Job("Task2", 0)
        );
        assertThat(rsl, lessThan(0));
    }
}