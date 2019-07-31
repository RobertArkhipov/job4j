package ru.job4j.tracker;

public class ExitProgram implements UserAction {
    @Override
    public int key() {
        return 6;
    }

    /**
     * Метод реализует выход из программы.
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.exit(0);
    }

    @Override
    public String info() {
        return "6. Выход из программы";
    }
}
