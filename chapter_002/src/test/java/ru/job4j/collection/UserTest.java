package ru.job4j.collection;

import org.junit.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 */
public class UserTest {

    /**
     * Тест-метод. Когда оба пользователя имеют разные имена.
     */
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    /**
     * Когда оба пользователя имеют разные имена.
     * Тест-метод сравнивает ответ метода compareTo и ожидаемый результат.
     */
    @Test
    public void whenComparePetrVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    /**
     * Тест-метод. Когда оба пользователя имеют одинковые имена.
     */
    @Test
    public void whenNamesAreEqual() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Oleg", 30));
        users.add(new User("Oleg", 29));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Oleg", 29)));
        assertThat(it.next(), is(new User("Oleg", 30)));
    }
}