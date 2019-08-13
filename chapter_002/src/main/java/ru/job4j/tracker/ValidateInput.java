package ru.job4j.tracker;

/**
 * ValidateInput получает данные из системы, до тех пор пока не будут введены правильные символы.
 */
public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    /**
     * @param question вопрос пользователю
     * @param range допустимые значения
     * @return заранее продуманный ответ
     */
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Пожалуйста, выберите значение из диапазона меню.");
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректное значение ещё раз.");
            }
        } while (invalid);
        return value;
    }
}
