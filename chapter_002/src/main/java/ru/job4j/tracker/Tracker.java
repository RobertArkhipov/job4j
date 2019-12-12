package ru.job4j.tracker;

import java.util.*;

/**
 * Task: Tracker.
 * @version $Id$
 * @since 0.1
 */
public class Tracker {

    /**
     * List для хранение заявок.
     */
    private List<Item> items = new ArrayList<>();
    private static Random rn = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод находит заявку по Id.
     * @param id id заявки.
     * @return заявка.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item index : items) {
            if (index.getId().equals(id)) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * Метод заменяет ячейку в массиве this.items.
     * @param id id заявки.
     * @param item заявка.
     * @return удалось ли провести операцию.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index != items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                result = true;
                item.setId(id);
                items.set(index, item);
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаляет ячейку в массиве this.items.
     * @param id уникальный ключ заявки.
     * @return удалось ли провести операцию.
     */
    public boolean delete(String id) {
        boolean result = false;
        Iterator<Item> itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
            Item nextItem = itemIterator.next();
            if (nextItem.getId().equals(id)) {
                itemIterator.remove();
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию items.
     * @return массив.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод находит заявку по имени.
     * @param key имя заявки.
     * @return результирующий ArrayList.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * @return уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + rn.nextInt());
    }
}