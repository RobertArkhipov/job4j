package ru.job4j.tracker;

class UpdateItem extends BaseAction {

    public UpdateItem(int key, String name) {
        super(key, name);
    }

    /**
     * Метод реализует редактирование заявки из хранилища.
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("--- Редактирование завяки ---");
        String id = input.ask("Введите ID заявки, которую нужно отредактировать: ");
        String name = input.ask("Введите новое имя заявки: ");
        String desc = input.ask("Введите новое описание заявки: ");
        Item item = new Item(name, desc, 0);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка с ID " + item.getId() + " теперь содержит:");
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание заявки: " + item.getDecs());
        } else {
            System.out.println("--- ID не найден ---");
        }
        System.out.println("     ");
    }
}