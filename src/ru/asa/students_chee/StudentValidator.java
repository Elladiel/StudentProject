package ru.asa.students_chee;

import javax.xml.bind.ValidationException;

/**
 * Created by Анастасия on 12.01.2017.
 */
public class StudentValidator {
    public static void validateYearOfStart(int yearOfStart) throws ValidationException {
        if(Integer.toString(yearOfStart).matches( "[0-9]{4}+")){
        }else{
            throw new ValidationException("Ошибка. Год поступления - положительное четырехзначное число.");
        }
    }
    public static void validateSpeciality(String speciality) throws ValidationException {
        if(speciality.matches( "\\d\\d.\\d\\d.\\d\\d")){

        }else{
            throw new ValidationException("Ошибка.");
        }
    }

}
