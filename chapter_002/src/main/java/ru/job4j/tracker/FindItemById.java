package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public int key() {
        return 4;
    }

    /**
     * Метод реализует поиск заявки по ID.
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("--- Поиск завяки по ID ---");
        String id = input.ask("Введите ID заявки, которую нужно найти: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка с ID " + item.getId() + " содержит: ");
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание заявки: " + item.getDecs());
        } else {
            System.out.println("--- не найдено ---");
        }
    }

    @Override
    public String info() {
        return "4. Поиск заявки по Id";
    }
}