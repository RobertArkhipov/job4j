package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (int index = 0; index < persons.size(); index++) {
            Person x = persons.get(index);
                   if (x.getName().contains(key)
                    || x.getSurname().contains(key)
                    || x.getPhone().contains(key)
                    || x.getAddress().contains(key)) {
                result.add(persons.get(index));
            }
        }
        return result;
    }
}

