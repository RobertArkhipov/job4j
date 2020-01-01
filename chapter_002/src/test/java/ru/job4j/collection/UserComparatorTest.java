package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class UserComparatorTest {

    /**
     * Тест-метод добавляет List пользователей в метод nameAscending,
     * и сравнивает с ожидаемым результатом. Ожидается корректная
     * сортировка пользователей по имени (по возрастанию).
     */
    @Test
    public void whenResultAnna() {
        List<User> users = Arrays.asList(
                new User("Petr", 21),
                new User("Ivan", 24),
                new User("Oleg", 12),
                new User("Anna", 30)
        );
        assertThat(new UserSorter().nameAscending(users).get(0).getName(), is("Anna"));
    }

    /**
     * Тест-метод добавляет List пользователей в метод nameDescending,
     * и сравнивает с ожидаемым результатом. Ожидается корректная
     * сортировка пользователей по имени (по убыванию).
     */
    @Test
    public void whenResultPetr() {
        List<User> users = Arrays.asList(
                new User("Petr", 21),
                new User("Ivan", 24),
                new User("Oleg", 12),
                new User("Anna", 30)
        );
        assertThat(new UserSorter().nameDescending(users).get(0).getName(), is("Petr"));
    }

    /**
     * Тест-метод добавляет List пользователей в метод ageAscending,
     * и сравнивает с ожидаемым результатом. Ожидается корректная
     * сортировка пользователей по возрасту (по возрастанию).
     */
    @Test
    public void whenResult12() {
        List<User> users = Arrays.asList(
                new User("Petr", 21),
                new User("Ivan", 24),
                new User("Oleg", 12),
                new User("Anna", 30)
        );
        assertThat(new UserSorter().ageAscending(users).get(0).getAge(), is(12));
    }

    /**
     * Тест-метод добавляет List пользователей в метод ageDescending,
     * и сравнивает с ожидаемым результатом. Ожидается корректная
     * сортировка пользователей по возрасту (по убыванию).
     */
    @Test
    public void whenResult30() {
        List<User> users = Arrays.asList(
                new User("Petr", 21),
                new User("Ivan", 24),
                new User("Oleg", 12),
                new User("Anna", 30)
        );
        assertThat(new UserSorter().ageDescending(users).get(0).getAge(), is(30));
    }
}


