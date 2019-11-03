package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод вставляет в нужную позицию элемент.
     * Позиция определятся по полю приоритет.
     * @param task задача
     */
    public void put(Task task) {
        for (int index = 0; index < tasks.size() + 1; index++) {
            if (index == task.getPriority() - 1) {
                tasks.add(index, task);
                break;
            } else if (index == tasks.size()) {
                tasks.add(task);
            }
        }
    }
    public Task take() {
        return this.tasks.poll();
    }
}