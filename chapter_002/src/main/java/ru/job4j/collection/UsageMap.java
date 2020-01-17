package ru.job4j.collection;

import java.util.HashMap;

/**
 * Task.
 */
public class UsageMap {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        map.put("s34s@bk.ru", "Robert Arkhipov Aleksandrovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}