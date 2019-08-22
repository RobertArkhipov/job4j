package ru.job4j.tracker;

class ExitProgram extends BaseAction {

    private final StartUI ui;

    public ExitProgram(int key, String name, StartUI ui) {
        super(key, name);
        this.ui = ui;
    }

    /**
     * Метод реализует выход из программы.
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        this.ui.stop();
    }
}
