package ru.job4j.list;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class UserConvertTest {

    /**
     * Тест-метод проверяет, что
     * метод process принял список пользователей и конвертировал его в Map.
     */
    @Test
    public void ifCityMeansCity() {
        UserConvert user = new UserConvert();
        List<User> list = new ArrayList<>();
        list.add(new User(0, "Ivan", "Moscow"));
        list.add(new User(1, "Alisa", "Yekaterinburg"));
        assertThat(user.process(list).get(1).getCity(), is(list.get(1).getCity()));
    }
}
