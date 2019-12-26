package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemSortDescendingTest {

    /**
     * Тест-метод добавляет List заявок в метод ItemSortDescending,
     * и сравнивает с ожидаемым результатом. Ожидается корректная
     * сортировка заявок (по имени) по убыванию.
     */
    @Test
    public void whenResult321() {
        List<Item> items = Arrays.asList(
                new Item("test name3", "desc3", 0L),
                new Item("test name1", "desc1", 1L),
                new Item("test name2", "desc2", 2L));
        assertThat(new ItemSortDescending().sortItem(items).get(2).getName(), is("test name1"));
    }
}
