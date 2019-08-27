package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class TrackerSingleTest {

    /**
     * 1. enum. Eager loading.
     * Тест-метод проверяет, что при нескольких
     * созданиях нового Tracker, будет возвращаться один и тот же объект.
     */
    @Test
    public void firstTestWhenCreatedSeveralObjectsButAlwaysReturnsOne() {
        TrackerSingle trackerFirst = TrackerSingle.INSTANCE;
        TrackerSingle trackerSecond = TrackerSingle.INSTANCE;
        Item item = new Item("test", "testDescription", 0L);
        assertThat(trackerFirst.add(item).getId(), is(trackerSecond.add(item).getId()));
    }

    /**
     * 2. static field. Lazy loading.
     * Тест-метод проверяет, что при нескольких
     * созданиях нового Tracker, будет возвращаться один и тот же объект.
     */
    @Test
    public void secondTestWhenCreatedSeveralObjectsButAlwaysReturnsOne() {
        TrackerSingleTwo trackerFirst = TrackerSingleTwo.getInstance();
        TrackerSingleTwo trackerSecond = TrackerSingleTwo.getInstance();
        Item item = new Item("test", "testDescription", 0L);
        assertThat(trackerFirst.add(item).getId(), is(trackerSecond.add(item).getId()));
    }

    /**
     * 3. static final field. Eager loading.
     * Тест-метод проверяет, что при нескольких
     * созданиях нового Tracker, будет возвращаться один и тот же объект.
     */
    @Test
    public void thirdTestWhenCreatedSeveralObjectsButAlwaysReturnsOne() {
        TrackerSingleThree trackerFirst = TrackerSingleThree.getInstance();
        TrackerSingleThree trackerSecond = TrackerSingleThree.getInstance();
        Item item = new Item("test", "testDescription", 0L);
        assertThat(trackerFirst.add(item).getId(), is(trackerSecond.add(item).getId()));
    }

    /**
     * 4. private static final class. Lazy loading.
     * Тест-метод проверяет, что при нескольких
     * созданиях нового Tracker, будет возвращаться один и тот же объект.
     */
    @Test
    public void fourthTestWhenCreatedSeveralObjectsButAlwaysReturnsOne() {
        TrackerSingleFour trackerFirst = TrackerSingleFour.getInstance();
        TrackerSingleFour trackerSecond = TrackerSingleFour.getInstance();
        Item item = new Item("test", "testDescription", 0L);
        assertThat(trackerFirst.add(item).getId(), is(trackerSecond.add(item).getId()));
    }
}
