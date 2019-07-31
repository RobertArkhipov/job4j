package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return 3;
    }

    /**
     * Метод реализует удаление заявки из хранилища.
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("--- Удаление завяки ---");
        String id = input.ask("Введите ID заявки, которую нужно удалить: ");
        if (tracker.delete(id)) {
            System.out.println("--- Заявка успешно удалена. ---");
        } else {
            System.out.println("--- ID не найден ---");
        }
        System.out.println("     ");
    }

    @Override
    public String info() {
        return "3. Удалить заявку";
    }
}