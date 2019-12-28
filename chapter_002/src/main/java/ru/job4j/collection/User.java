package ru.job4j.collection;

import org.jetbrains.annotations.NotNull;
import java.util.Objects;

/**
 * Task.
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод compareTo сравнивает имена, если они равны, то сравнивает возраст.
     * @param o пользователь.
     * @return вычисленное значение.
     */
    @Override
    public int compareTo(@NotNull User o) {
        int a = name.compareTo(o.name);
        if (a == 0) {
            return age - o.age;
        }
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}