package ru.job4j.collection;

import java.util.Collections;
import java.util.List;
import ru.job4j.tracker.Item;

/**
 * Task.
 */
public class ItemSortAscending {

    /**
     * Метод реализует сортировку заявок (по имени) по возрастанию.
     * @param item List заявок.
     * @return отсортированный List заявок.
     */
    public List<Item> itemSort(List<Item> item) {
        System.out.println(item);
        Collections.sort(item);
        System.out.println(item);
        return item;
    }
}
