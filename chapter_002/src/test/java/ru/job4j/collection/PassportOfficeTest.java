package ru.job4j.collection;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 */
public class PassportOfficeTest {

    /**
     * Создаём нового пользователя и добавляем его в систему.
     * Тест-метод осуществляет поиск этого пользователя и
     * сравнивает с ожидаемым результатом.
     */
    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}