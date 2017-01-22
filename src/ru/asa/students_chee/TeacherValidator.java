package ru.asa.students_chee;

import ru.asa.console_input.Console;

import javax.xml.bind.ValidationException;

/**
 * Created by Анастасия on 13.01.2017.
 */
public class TeacherValidator {
    public static void validateCategory(String category) throws ValidationException {
      if(category.matches("высшая|первая|без категории")){
      }else{
          throw new ValidationException("Ошибка. Попробуйте снова!");
      }
    }
}
