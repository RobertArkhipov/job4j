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
        if (tasks.peekFirst() == null) {
            tasks.add(task);
        }
        for (int index = 0; index < tasks.size(); index++) {
            Task tsk = tasks.get(index);
            if (task.getPriority() < tsk.getPriority()) {
                if (index == 0) {
                    tasks.addFirst(task);
                    break;
                } else {
                    tasks.add(index, task);
                    break;
                }
            }
            if (index == tasks.size() - 1) {
                tasks.addLast(task);
                break;
            }
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}