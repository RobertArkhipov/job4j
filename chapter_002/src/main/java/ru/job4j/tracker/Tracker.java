package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Task: Tracker.
 * @version $Id$
 * @since 0.1
 */
public class Tracker {

    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    private int position = 0;
    private static Random rn = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод находит заявку по Id.
     * @param id id заявки.
     * @return заявка.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Массив должен заменить ячейку в массиве this.items.
     * @param id id заявки.
     * @param item заявка.
     * @return удалось ли провести операцию.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                result = true;
                this.items[index] = item;
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
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                result = true;
                System.arraycopy(this.items, index + 1, this.items, index, this.position);
                this.position--;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива this.items без null элементов.
     * @return массив.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * Метод находит заявку по имени.
     * @param key имя заявки.
     * @return результирующий массив.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int count = 0;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[count] = this.items[index];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * @return уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + rn.nextInt());
    }
}