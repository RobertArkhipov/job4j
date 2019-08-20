package ru.job4j.tracker;

class ExitProgram extends BaseAction {

    public ExitProgram(int key, String name) {
        super(key, name);
    }

    /**
     * Метод реализует выход из программы.
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.exit(0);
    }
}
