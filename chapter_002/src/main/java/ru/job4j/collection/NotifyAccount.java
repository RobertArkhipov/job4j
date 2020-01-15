package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * Task.
 */
public class NotifyAccount {

    /**
     * Метод sent убирает дубликаты клиентов из List.
     * @param accounts список аккаунтов.
     * @return список аккаунтов без дубликатов.
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account value : accounts) {
            rsl.add(value);
        }
        return rsl;
    }
}