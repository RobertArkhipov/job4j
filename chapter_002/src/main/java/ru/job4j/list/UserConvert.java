package ru.job4j.list;

import java.util.HashMap;
import java.util.List;


public class UserConvert {

    /**
     * Метод process принимает в себя список пользователей и конвертирует его в Map
     * с ключом id и соответствующим ему пользователем User.
     * @param list список пользователей.
     * @return Map (ключ - пользователь).
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> user = new HashMap<>();
        for (User index: list) {
            user.put(index.getId(), index);
        }
        return user;
    }
}
