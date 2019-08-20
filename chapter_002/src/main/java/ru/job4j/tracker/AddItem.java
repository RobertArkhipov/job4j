package ru.job4j.tracker;

class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("--- Добавление новой заявки ---");
        String name = input.ask("Введите имя заявки: ");
        String desc = input.ask("Введите описание заявки: ");
        Item item = new Item(name, desc, 0L);
        tracker.add(item);
        System.out.println("--- Id новой заявки: " + item.getId());
        System.out.println("--- Имя новой заявки: " + item.getName());
        System.out.println("--- Описание новой заявки: " + item.getDecs());
    }
}