package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemSortAscendingTest {

    /**
     * Тест-метод добавляет List заявок в метод ItemSortAscending,
     * и сравнивает с ожидаемым результатом. Ожидается корректная
     * сортировка заявок (по имени) по возрастанию.
     */
    @Test
    public void whenResult123() {
        List<Item> items = Arrays.asList(
                new Item("test name3", "desc3", 0L),
                new Item("test name1", "desc1", 1L),
                new Item("test name2", "desc2", 2L));
        assertThat(new ItemSortAscending().itemSort(items).get(2).getName(), is("test name3"));
    }
}
