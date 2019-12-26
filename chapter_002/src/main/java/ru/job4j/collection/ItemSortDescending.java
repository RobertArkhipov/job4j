package ru.job4j.collection;

import ru.job4j.tracker.Item;
import java.util.Collections;
import java.util.List;

/**
 * Task.
 */
public class ItemSortDescending {

    /**
     * Метод реализует сортировку заявок (по имени) по убыванию (через компаратор).
     * @param item List заявок.
     * @return отсортированный List заявок.
     */
    public List<Item> sortItem(List<Item> item) {
        System.out.println(item);
        Collections.sort(item, new ItemSorter());
        System.out.println(item);
        return item;
    }
}