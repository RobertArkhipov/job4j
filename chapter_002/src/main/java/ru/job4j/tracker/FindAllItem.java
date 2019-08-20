package ru.job4j.tracker;

class FindAllItem extends BaseAction {

    public FindAllItem(int key, String name) {
        super(key, name);
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
}