package ru.job4j.collection;

import java.util.HashSet;

/**
 * Task.
 */
public class UniqueText {

    /**
     * Метод isEquals сравнивает два текста.
     * Если они состоят из один и тех же слов,
     * то считаем, что проверяемый текст не уникален.
     * @param originText оригинальный текст.
     * @param duplicateText проверяемый текст.
     * @return уникален текст или нет.
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String reference: origin) {
            check.add(reference);
        }
        for (String value: text) {
            if (check.contains(value) != rsl) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}