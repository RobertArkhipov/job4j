package ru.job4j.stream;

import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class ProfilesTest {

    /**
     * Тест-метод сравнивает ответ метода Profiles.collect и ожидаемый результат.
     * Ожидается список уникальных адресов клиентов, отсортированных по полю String city.
     */
    @Test
    public void whenResultIsAddresses() {
        List<Profile> clients = Arrays.asList(
                new Profile(new Address("Moscow", "Vishnovaya,", 5, 1)),
                new Profile(new Address("Moscow", "Vishnovaya,", 5, 1)),
                new Profile(new Address("Bryansk", "Lenina", 3, 25)),
                new Profile(new Address("Voronezh", "Savrasova", 2, 56)),
                new Profile(new Address("Voronezh", "Savrasova", 2, 56))
        );
        List<Address> result = Profiles.collect(clients, Comparator.comparing(Address::getCity));
        assertThat(result.get(0).getCity(), is("Bryansk"));
    }
}