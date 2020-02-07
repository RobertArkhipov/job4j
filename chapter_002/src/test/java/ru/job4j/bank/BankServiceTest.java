package ru.job4j.bank;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 */
public class BankServiceTest {

    /**
     * Тест-метод сравнивает ответ метода FullSearch.addUser и ожидаемый результат.
     * Ожидается успешное добавление пользователя в систему.
     */
    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    /**
     * Тест-метод сравнивает ответ метода FullSearch.addAccount и ожидаемый результат.
     * Ожидается успешное добавление счёта.
     */
    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
     //   bank.addAccount(user.getPassport(), new Account("5546", 150));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150.0));
    }

    /**
     * Тест-метод сравнивает ответ метода FullSearch.transferMoney и ожидаемый результат.
     * Ожидается успешное выполнение перевода с одного счёта на другой.
     */
    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        bank.addAccount(user.getPassport(), new Account("113", 50));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150);
        assertThat(bank.findByRequisite("3434", "113").getBalance(), is(200.0));
    }
}