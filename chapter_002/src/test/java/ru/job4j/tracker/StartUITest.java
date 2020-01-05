package ru.job4j.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

/**
 * Test.
 */
public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Тест-метод добавляет заявку и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name"));
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

    /**
     * Тест-метод отображает все заявки в хранилище, и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenFindAllThenTrackerHasAllValues() {
        System.setOut(new PrintStream(this.out));
        String ln = System.lineSeparator();
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item("test name first", "desc first", 0L));
        Item second = tracker.add(new Item("test name second", "desc second", 1L));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        //assertThat(new String(out.toByteArray()).substring(211, 396), is(new StringBuilder()  // если \r\n
          assertThat(new String(out.toByteArray()).substring(202, 381), is(new StringBuilder()  // если \n
                        .append("Имя заявки: " + first.getName())
                        .append(ln)
                        .append("Описание заявки: " + first.getDecs())
                        .append(ln)
                        .append("ID заявки: " + first.getId())
                        .append(ln + "---------------" + ln)
                        .append("Имя заявки: " + second.getName())
                        .append(ln)
                        .append("Описание заявки: " + second.getDecs())
                        .append(ln)
                        .append("ID заявки: " + second.getId())
                        .toString()
                )
        );
        System.setOut(this.stdout);
    }

    /**
     * Тест-метод осуществляет поиск заявки по имени, и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenFindByNameThenTrackerFindsValue() {
        System.setOut(new PrintStream(this.out));
        String ln = System.lineSeparator();
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item("test name first", "desc first", 0L));
        tracker.add(new Item("test name second", "desc second", 1L));
        Input input = new StubInput(new String[]{"5", "test name first", "6"});
        new StartUI(input, tracker).init();
        //assertThat(new String(out.toByteArray()).substring(231, 313), is(new StringBuilder()  // если \r\n
          assertThat(new String(out.toByteArray()).substring(221, 301), is(new StringBuilder()  // если \n
                        .append("Имя заявки: " + first.getName())
                        .append(ln)
                        .append("Описание заявки: " + first.getDecs())
                        .append(ln)
                        .append("ID заявки: " + first.getId())
                        .toString()
                )
        );
        System.setOut(this.stdout);
    }

    /**
     * Тест-метод осуществляет поиск заявки по ID, и сравнивает с ожидаемым результатом.
     */
    @Test
    public void whenFindByIDThenTrackerFindsValue() {
        System.setOut(new PrintStream(this.out));
        String ln = System.lineSeparator();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 0L));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        //assertThat(new String(out.toByteArray()).substring(210, 292), is(new StringBuilder()  // если \r\n
          assertThat(new String(out.toByteArray()).substring(201, 281), is(new StringBuilder()  // если \n
                        .append("Заявка с ID " + item.getId() + " содержит: ")
                        .append(ln)
                        .append("Имя заявки: " + item.getName())
                        .append(ln)
                        .append("Описание заявки: " + item.getDecs())
                        .toString()
                )
        );
        System.setOut(this.stdout);
    }
}