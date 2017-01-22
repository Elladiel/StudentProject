package ru.asa.students_chee;

import ru.asa.console_input.Console;

import javax.xml.bind.ValidationException;
import java.util.InputMismatchException;

/**
 * Created by Анастасия on 11.01.2017.
 */
public class PersonValidator {


    public static void validateSurname(String surname) throws ValidationException {
        if(surname.matches( "[А-Яа-я]+")){

        }else{
            throw new ValidationException("Ошибка.");
        }
    }

    public static void validateYearOfBirth(int yearOfBirth) throws ValidationException {
        if(Integer.toString(yearOfBirth).matches("[0-9]{4}+")){
        }else {
            throw new ValidationException("Ошибка. Год рождения - положительное четырехзначное число.");
        }
    }

    public static void validateGender(String gender) throws ValidationException {
        if(gender.matches("(женский|мужской)")){

        }else{
            throw new ValidationException("Ошибка. Доступны только \" женский\" и \"мужской\" пол.");
        }
    }
}
