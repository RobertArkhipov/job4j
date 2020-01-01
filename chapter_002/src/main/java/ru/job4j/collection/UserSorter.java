package ru.job4j.collection;

import java.util.Collections;
import java.util.List;

/**
 * Task. Сортировка User с использованием Comparator.
 */
public class UserSorter {

    /**
     * Метод реализует сортировку пользователей по имени (по возрастанию).
     * @param users List пользователей.
     * @return отсортированный List пользователей.
     */
    List<User> nameAscending(List<User> users) {
        System.out.println(users);
        Collections.sort(users, new UserAscByName());
        System.out.println(users);
        return users;
    }

    /**
     * Метод реализует сортировку пользователей по имени (по убыванию).
     * @param users List пользователей.
     * @return отсортированный List пользователей.
     */
    List<User> nameDescending(List<User> users) {
        System.out.println(users);
        Collections.sort(users, new UserDescByName());
        System.out.println(users);
        return users;
    }

    /**
     * Метод реализует сортировку пользователей по возрасту (по возрастанию).
     * @param users List пользователей.
     * @return отсортированный List пользователей.
     */
    List<User> ageAscending(List<User> users) {
        System.out.println(users);
        Collections.sort(users, new UserAscByAge());
        System.out.println(users);
        return users;
    }

    /**
     * Метод реализует сортировку пользователей по возрасту (по убыванию).
     * @param users List пользователей.
     * @return отсортированный List пользователей.
     */
    List<User> ageDescending(List<User> users) {
        System.out.println(users);
        Collections.sort(users, new UserDescByAge());
        System.out.println(users);
        return users;
    }

    /**
     * Метод реализует сортировку пользователей по имени (по возрастанию) и возрасту (по возрастанию).
     * @param users List пользователей.
     * @return отсортированный List пользователей.
     */
    List<User> nameAgeAscending(List<User> users) {
        System.out.println(users);
        Collections.sort(users, new UserAscByName().thenComparing(new UserAscByAge()));
        System.out.println(users);
        return users;
    }

    /**
     * Метод реализует сортировку пользователей по имени (по убыванию) и возрасту (по убыванию).
     * @param users List пользователей.
     * @return отсортированный List пользователей.
     */
    List<User> nameAgeDescending(List<User> users) {
        System.out.println(users);
        Collections.sort(users, new UserDescByName().thenComparing(new UserDescByAge()));
        System.out.println(users);
        return users;
    }
}