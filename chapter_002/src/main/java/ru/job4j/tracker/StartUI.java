package ru.job4j.tracker;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private static final String ADD = "0";
    private static final String ALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String SEARCH = "4";
    private static final String NAME = "5";
    private static final String EXIT = "6";

    private final Input input;
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню: ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (ALL.equals(answer)) {
                this.showItem();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (SEARCH.equals(answer)) {
                this.findItemByID();
            } else if (NAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавление новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("--- Добавление новой заявки ---");
        String name = this.input.ask("Введите имя заявки: ");
        String desc = this.input.ask("Введите описание заявки: ");
        Item item = new Item(name, desc, 0);
        this.tracker.add(item);
        System.out.println("--- Новая заявка с Id : " + item.getId() + " создана ---");
        System.out.println("     ");
    }

    /**
     * Метод реализует отображение всех заявок из хранилища.
     */
    private void showItem() {
        System.out.println("--- Список всех заявок: ---");
        for (Item item: this.tracker.findAll()) {
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание заявки: " + item.getDecs());
            System.out.println("ID заявки: " + item.getId());
            System.out.println("---------------");
        }
        System.out.println("     ");
    }

    /**
     * Метод реализует редактирование заявки из хранилища.
     */
    private void editItem() {
        System.out.println("--- Редактирование завяки ---");
        String id = this.input.ask("Введите ID заявки, которую нужно отредактировать: ");
        String name = this.input.ask("Введите новое имя заявки: ");
        String desc = this.input.ask("Введите новое описание заявки: ");
        Item item = new Item(name, desc, 0);
        if (this.tracker.replace(id, item)) {
            System.out.println("Заявка с ID " + item.getId() + " теперь содержит:");
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание заявки: " + item.getDecs());
        } else {
            System.out.println("--- ID не найден ---");
        }
        System.out.println("     ");
    }

    /**
     * Метод реализует удаление заявки из хранилища.
     */
    private void deleteItem() {
        System.out.println("--- Удаление завяки ---");
        String id = this.input.ask("Введите ID заявки, которую нужно удалить: ");
        if (this.tracker.delete(id)) {
            System.out.println("--- Заявка успешно удалена. ---");
        } else {
            System.out.println("--- ID не найден ---");
        }
        System.out.println("     ");
    }

    /**
     * Метод реализует поиск заявки по ID.
     */
    private void findItemByID() {
        System.out.println("--- Поиск завяки по ID ---");
        String id = this.input.ask("Введите ID заявки, которую нужно найти: ");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка с ID " + item.getId() + " содержит: ");
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание заявки: " + item.getDecs());
        } else {
            System.out.println("--- не найдено ---");
        }
    }
    /**
     * Метод реализует поиск заявки по имени.
     */
    private void findItemByName() {
        System.out.println("--- Поиск завяки по имени ---");
        String name = this.input.ask("Введите имя заявки, которую нужно найти: ");
        System.out.println("--- Найдено: ---");
        for (Item item : this.tracker.findByName(name)) {
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание заявки: " + item.getDecs());
            System.out.println("ID заявки: " + item.getId());
            System.out.println("-------------------");
        }
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Добавить новую заявку");
        System.out.println("1. Отобразить все заявки");
        System.out.println("2. Редактировать заявку");
        System.out.println("3. Удалить заявку");
        System.out.println("4. Поиск заявки по Id");
        System.out.println("5. Поиск заявки по имени");
        System.out.println("6. Выход из программы");
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}