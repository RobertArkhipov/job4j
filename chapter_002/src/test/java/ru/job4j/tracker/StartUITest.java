package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

/**
 * Test.
 */
public class StartUITest {

    /**
     * Тест-метод добавляет заявку и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    /**
     * Тест-метод заменяет заявку и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 0));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    /**
     * Тест-метод осуществляет удаление заявки, и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenDeleteThenTrackerHasDeletedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 0));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}
