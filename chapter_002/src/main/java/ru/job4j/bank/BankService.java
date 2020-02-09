package ru.job4j.bank;

import java.util.*;

/**
 * Task.
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * @param user пользователь.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет к пользователю.
     * @param passport паспорт пользователя.
     * @param account счёт.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        boolean count = false;
        if (user != null) {
            for (Account value : users.get(user)) {
                if (value.getRequisite().equals(account.getRequisite())) {
                    count = true;
                    break;
                }
            }
        }
        if (!count) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод должен найти пользователя по номеру паспорта.
     * @param passport паспорт пользователя.
     * @return найденный пользователь или null если не найден.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод должен найти счёт пользователя по реквизитам.
     * Сначала находим пользователя. Потом получаем список счетов этого пользователя
     * и в них находим нужный счёт.
     * @param passport паспорт пользователя.
     * @param requisite реквизиты счёта.
     * @return счёт пользователя или null если не найден.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account value : users.get(user)) {
                if (value.getRequisite().equals(requisite)) {
                    return value;
                }
            }
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой.
     * @param srcPassport паспорт отправителя.
     * @param srcRequisite реквизиты счёта с которого переводят деньги.
     * @param destPassport паспорт получателя.
     * @param destRequisite реквизиты счёта на который переводят деньги.
     * @param amount сумма перевода.
     * @return выполнен ли перевод.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountFirst = findByRequisite(srcPassport, srcRequisite);
        Account accountSecond = findByRequisite(destPassport, destRequisite);
        if (accountFirst.getBalance() >= amount) {
            accountFirst.setBalance(accountFirst.getBalance() - amount);
            accountSecond.setBalance(accountSecond.getBalance() + amount);
            return true;
        }
        return rsl;
    }
}