package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class UserCombinComparatorTest {

    /**
     * Тест-метод добавляет List пользователей в метод nameAgeAscending,
     * и сравнивает с ожидаемым результатом. Ожидается корректная
     * сортировка пользователей по имени (по возрастанию) и возрасту (по возрастанию).
     */
    @Test
    public void whenResultAnna() {
        List<User> users = Arrays.asList(
                new User("Ivan", 20),
                new User("Ivan", 24),
                new User("Petr", 30),
                new User("Ivan", 35)
        );
        assertThat(new UserSorter().nameAgeAscending(users).get(2).getName(), is("Ivan"));
    }

    /**
     * Тест-метод добавляет List пользователей в метод nameAgeDescending,
     * и сравнивает с ожидаемым результатом. Ожидается корректная
     * сортировка пользователей по имени (по убыванию)и возрасту (по убыванию).
     */
    @Test
    public void whenResultPetr() {
        List<User> users = Arrays.asList(
                new User("Petr", 21),
                new User("Oleg", 24),
                new User("Oleg", 12),
                new User("Oleg", 30)
        );
        assertThat(new UserSorter().nameAgeDescending(users).get(3).getName(), is("Oleg"));
    }
}
