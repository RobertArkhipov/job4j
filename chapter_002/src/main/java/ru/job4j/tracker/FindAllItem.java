package ru.job4j.tracker;

public class FindAllItem implements UserAction {
    @Override
    public int key() {
        return 1;
    }

    /**
     * Метод реализует отображение всех заявок из хранилища.
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("--- Список всех заявок: ---");
        for (Item item: tracker.findAll()) {
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание заявки: " + item.getDecs());
            System.out.println("ID заявки: " + item.getId());
            System.out.println("---------------");
        }
        System.out.println("     ");
    }

    @Override
    public String info() {
        return "1. Отобразить все заявки";
    }
}