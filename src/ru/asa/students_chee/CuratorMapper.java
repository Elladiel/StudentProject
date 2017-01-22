package ru.asa.students_chee;

import javax.xml.bind.ValidationException;

/**
 * Created by Анастасия on 16.01.2017.
 */
public class CuratorMapper {
    public static boolean map(String curator) throws ValidationException {
        if (curator.equals("Да")) return true;
        if (curator.equals("Нет")) return false;

        throw new ValidationException("Ошибка ввода. Возможные варианты: да, нет.");
    }
}
