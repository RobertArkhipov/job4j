package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Task.
 */
public class OrderConvert {

    /**
     * Метод process конвертирует элементы списка orders в map.
     * В качестве ключа используется поле number.
     * @param orders список orders.
     * @return map, где первый параметр - номер, а второй - заявка.
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order value : orders) {
            map.put(value.getNumber(), value);
        }
        return map;
    }
}