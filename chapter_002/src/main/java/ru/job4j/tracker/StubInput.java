package ru.job4j.tracker;

public class StubInput implements Input {

    private final String[] value;
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }

    /**
     * @param question вопрос пользователю
     * @return заранее продуманный ответ
     */
    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }

    public int ask(String question, int[] range) {
      // throw new UnsupportedOperationException("Неподдерживаемая операция");
        return -1;
    }
}