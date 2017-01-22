package ru.asa.students_chee;

import com.sun.jndi.cosnaming.ExceptionMapper;

import javax.xml.bind.ValidationException;

/**
 * Created by Анастасия on 16.01.2017.
 */
public class CategoryMapper {
    public static Category map(String category) throws ValidationException {
        if (category.equals("первая")) {
            return Category.первая;
        } else if (category.equals("высшая")) {
            return Category.высшая;
        }else if(category.equals("без категории")){
            return Category.без_категории;
        }
        throw new ValidationException("Ошибка ввода категории. Возможные варианты: первая, высшая, без категории.");
    }
}
