package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class UserComparatorTest {

    /**
     * Тест-метод отправляет 2 параметра в метод compare класса UserAscByAge,
     * и сравнивает с ожидаемым результатом. Ожидается корректное
     * сравнение полей возраста (для сортировки по возрастанию).
     */
    @Test
    public void whenAscByAge() {
        Comparator<User> ascByAge = new UserAscByAge();
        int result = ascByAge.compare(
                new User("Petr", 21),
                new User("Ivan", 24)
        );
        assertThat(result, lessThan(0));
    }

    /**
     * Тест-метод отправляет 2 параметра в метод compare класса UserDescByAge,
     * и сравнивает с ожидаемым результатом. Ожидается корректное
     * сравнение полей возраста (для сортировки по убыванию).
     */
    @Test
    public void whenDescByAge() {
        Comparator<User> descByAge = new UserDescByAge();
        int result = descByAge.compare(
                new User("Petr", 21),
                new User("Ivan", 24)
        );
        assertThat(result, is(1));
    }

    /**
     * Тест-метод отправляет 2 параметра в метод compare класса UserAscByName,
     * и сравнивает с ожидаемым результатом. Ожидается корректное
     * сравнение полей имени (для сортировки по возрастанию).
     */
    @Test
    public void whenAscByName() {
        Comparator<User> ascByName = new UserAscByName();
        int result = ascByName.compare(
                new User("Ivan", 24),
                new User("Petr", 21)
        );
        assertThat(result, lessThan(0));
    }

    /**
     * Тест-метод отправляет 2 параметра в метод compare класса UserDescByName,
     * и сравнивает с ожидаемым результатом. Ожидается корректное
     * сравнение полей имени (для сортировки по убыванию).
     */
    @Test
    public void whenDescByName() {
        Comparator<User> descByName = new UserDescByName();
        int result = descByName.compare(
                new User("Ivan", 24),
                new User("Petr", 21)
        );
        assertThat(result, greaterThan(0));
    }

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


