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
        String val = this.value[this.position];
        if (this.position < this.value.length - 1) {
            this.position++;
        }
        return val;
    }

    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new UnsupportedOperationException("Неподдерживаемая операция");
        }
    }
}