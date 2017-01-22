package ru.asa.students_chee;

import ru.asa.console_input.Console;

import javax.xml.bind.ValidationException;
import java.util.InputMismatchException;

/**
 * Created by default on 21.12.2016.
 */
public class Teacher extends Person {
    private boolean curator;
    private Category category;

    public Teacher(String surname, String gender, int yearOfBirth, boolean curator, Category category) {
        super(surname, gender, yearOfBirth);
        this.curator = curator;
        this.category = category;
    }

    public Teacher() {
        this("Морозов", "мужской", 1957, true, Category.высшая);
    }

    @Override
    public void input() throws ValidationException {
        super.input();
        curator = inputCurator();
        category = inputCategory();
    }

    private boolean inputCurator() {
        String curator;
        do {
            try {
                System.out.println("Преподаватель является куратором? Введите \"Да\" или \"Нет\", пожалуйста.");
                curator = Console.readString();
                return CuratorMapper.map(curator);
            } catch (ValidationException exception) {
                System.out.println(exception.getMessage() + "Введите снова.");
            }
        }
        while (true);
    }

    private Category inputCategory() {
        String category;
        do {
            try {
                System.out.println("Введите категорию(первая, высшая или без категории):");
                category = Console.readString();
                return CategoryMapper.map(category);

            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage() + "Введите снова.");
            } catch (ValidationException exception) {
                System.out.println(exception.getMessage() + "\nВведите снова.");
            }
        }
        while (true);
    }

    public boolean isCurator() {
        return curator;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Преподаватель{" + "Фамилия: " + super.getSurname() +
                ", пол: " + super.getGender() +
                ", год рождения: " + super.getYearOfBirth() +
                (isCurator() ? " ,куратор" : " ,не куратор") +
                ", категория: " + category +
                '}';
    }
}
