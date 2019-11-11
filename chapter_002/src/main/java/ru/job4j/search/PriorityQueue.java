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
        for (int index = 0; index < tasks.size(); index++) {
            if (task.getPriority() < tasks.get(index).getPriority()) {
                tasks.add(index, task);
                break;
            }
        }
        tasks.add(task);
    }
    public Task take() {
        return this.tasks.poll();
    }
}