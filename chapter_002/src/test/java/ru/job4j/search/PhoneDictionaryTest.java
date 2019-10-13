package ru.job4j.search;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class PhoneDictionaryTest {

    /**
     * Тест-метод добавляет пользователя в телефонный справочник,
     * и сравнивает итоги поиска этого пользователя (по имени) и ожидаемый результат.
     */
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("Petr");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }

    /**
     * Тест-метод добавляет пользователя в телефонный справочник,
     * и сравнивает итоги поиска этого пользователя (по номеру телефона) и ожидаемый результат.
     */
    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("534");
        assertThat(persons.iterator().next().getAddress(), is("Bryansk"));
    }

    /**
     * Тест-метод добавляет пользователя в телефонный справочник,
     * и сравнивает итоги поиска этого пользователя (по адресу) и ожидаемый результат.
     */
    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("nsk");
        assertThat(persons.iterator().next().getName(), is("Petr"));
    }
}