package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test.
 */
public class NotifyAccountTest {

    /**
     * Ожидается, что при отсутствии дубликатов в изначальном листе,
     * итоговый список будет состоять из тех же аккаунтов.
     */
    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    /**
     * Ожидается, что при наличии дубликатов в изначальном листе,
     * итоговый список будет состоять только из уникальных аккаунтов.
     */
    @Test
    public void whenDuplicatesAreDeleted() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}