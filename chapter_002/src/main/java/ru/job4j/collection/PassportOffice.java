package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Task.
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод осуществляет добавление пользователя в систему.
     * @param citizen пользователь.
     * @return добавлен ли пользователь в систему.
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
        }
        return rsl;
    }

    /**
     * Метод возвращает информацию о пользователе по номеру его паспорта.
     * @param passport номер паспорта.
     * @return пользователь.
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}