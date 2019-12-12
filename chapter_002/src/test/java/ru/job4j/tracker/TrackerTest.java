package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Test.
 */
public class TrackerTest {

    /**
     * Тест-метод добавляет заявку и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenAddNewItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Тест-метод заменяет заявку и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenReplaceName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Тест-метод осуществляет поиск по ID, и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }

    /**
     * Тест-метод осуществляет поиск всех заявок, и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenFindAllItems() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        Item next = new Item("test2", "testDescription", 1234L);
        tracker.add(previous);
        tracker.add(next);
        List<Item> expected = new ArrayList<>();
        expected.add(previous);
        expected.add(next);
        assertThat(tracker.findAll(), is(expected));
    }

    /**
     * Тест-метод осуществляет поиск по имени, и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        Item next = new Item("test2", "testDescription", 1234L);
        tracker.add(previous);
        tracker.add(next);
        List<Item> expected = tracker.findAll();
        List<Item> result = tracker.findByName("test2");
        assertThat(result.get(0).getName(), is(expected.get(1).getName()));
    }

    /**
     * Тест-метод осуществляет удаление заявки, и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        Item second = new Item("test2", "testDescription", 1234L);
        tracker.add(first);
        tracker.add(second);
        tracker.delete(first.getId());
        assertThat(tracker.findAll().get(0).getId(), is(second.getId()));
    }
}