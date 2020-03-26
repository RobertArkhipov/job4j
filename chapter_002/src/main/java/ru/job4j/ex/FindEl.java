package ru.job4j.ex;

/**
 * Task.
 */
public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        FindEl find = new FindEl();
        String[] name = {"Igor", "Ivan", "Petr", "Andrey"};
        try {
            int rsl = find.indexOf(name, "Olga");
            System.out.println(rsl);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}