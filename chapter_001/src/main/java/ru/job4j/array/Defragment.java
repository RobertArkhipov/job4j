package ru.job4j.array;

/**
 * Task.
 */
public class Defragment {

    /**
     * Метод перемещает заполненные ячейки массива в начало, а пустые в конец.
     * @param array строковый массив.
     * @return отсортированный массив.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int notNullIndex = nullIndex + 1; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        String swap = array[nullIndex];
                        array[nullIndex] = array[notNullIndex];
                        array[notNullIndex] = swap;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}