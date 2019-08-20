package ru.job4j.tracker;

class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
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
}