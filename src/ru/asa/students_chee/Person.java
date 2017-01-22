package ru.asa.students_chee;

import ru.asa.console_input.Console;

import javax.xml.bind.ValidationException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String surname;
    private String gender;
    private int yearOfBirth;


    static Scanner scanner = new Scanner(System.in);

    public Person(String surname, String gender, int yearOfBirth) {
        this.surname = surname;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public Person() {
        this("Трошкин", "мужской", 1995);
    }


    public void input() throws ValidationException {
        this.surname = inputSurname();
        this.gender = inputGender();
        this.yearOfBirth = inputYearOfBirth();
    }

    private int inputYearOfBirth() throws ValidationException {
        do {
            try {
                System.out.println("Введите год рождения:");
                yearOfBirth = Console.readInt();
                PersonValidator.validateYearOfBirth(yearOfBirth);
                return yearOfBirth;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage() + " Введите снова.");
            } catch (ValidationException exception) {
                System.out.println(exception.getMessage() + " Введите снова.");

            }


        }
        while (true);
    }


    private String inputSurname() {
        do {
            try {
                System.out.println("Введите фамилию(используйте только русские или латинские буквы):");
                surname = Console.readString();
                PersonValidator.validateSurname(surname);
                return surname;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage() + "Введите снова.");
            } catch (ValidationException exc) {
                System.out.println(exc.getMessage() + "Введите снова.");
            }
        }
        while (true);
    }

    private String inputGender() {
        do {
            try {
                System.out.println("Введите пол(\"женский\" или \"мужской\"):");
                gender = Console.readString();
                PersonValidator.validateGender(gender);
                return gender;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage() + "Введите снова.");
            } catch (ValidationException exception) {
                System.out.println(exception.getMessage() + "Введите снова.");
            }
        }
        while (true);
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Человек{" +
                "Фамилия: " + surname +
                ", пол: " + gender +
                ", год рождения: " + yearOfBirth +
                '}';
    }
}
