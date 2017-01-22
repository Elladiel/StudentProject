package ru.asa.students_chee;

import ru.asa.console_input.Console;

import javax.xml.bind.ValidationException;
import java.util.InputMismatchException;

/**
 * Created by default on 21.12.2016.
 */
public class Student extends Person {
    private int yearOfStart;
    private String specialty;

    public Student(String surname, String gender, int yearOfBirth, int yearOfStart, String specialty) {
        super(surname, gender, yearOfBirth);

        this.yearOfStart = yearOfStart;
        this.specialty = specialty;
    }

    public Student() {
        this("Симонова", "женский", 1999, 2015, "09.02.03");
    }
    @Override
    public void input() throws ValidationException {
        super.input();

        yearOfStart = inputYearOfStart();
        specialty = inputSpeciality();
    }

    private int inputYearOfStart() throws ValidationException {
        System.out.println("Введите год поступления:");
        do {
            try {
                yearOfStart = Console.readInt();
                StudentValidator.validateYearOfStart(yearOfStart);
                return yearOfStart;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage() + " Введите снова.");
            } catch (ValidationException exception) {
                System.out.println(exception.getMessage() + "Введите снова.");
            }
        } while (true);

    }

    private String inputSpeciality() throws ValidationException {
        System.out.println("Введите код специальности(например, 09.02.03):");
        do {
            try {
                specialty = Console.readString();
                StudentValidator.validateSpeciality(specialty);
                return specialty;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage() + " Введите снова.");
            } catch (ValidationException exception) {
                System.out.println(exception.getMessage() + " Введите снова.");
            }
        } while (true);
    }

    public int getYearOfStart() {
        return yearOfStart;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Cтудент{Фамилия: " + super.getSurname() +
                ", пол: " + super.getGender() +
                ", год рождения: " + super.getYearOfBirth() +
                ", год поступления: " + yearOfStart +
                ", код специальности: " + specialty +
                '}';
    }
}
