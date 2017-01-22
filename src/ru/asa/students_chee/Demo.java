package ru.asa.students_chee;

import javax.xml.bind.ValidationException;
import java.util.ArrayList;

/**
 * Created by default on 21.12.2016.
 */
public class Demo {
    public static void main(String args[]) throws ValidationException {
        int countOfStudents = 2;
        int countOfTeachers = 0;

        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Информация о студентах.");
        fillStudentsList(countOfStudents, students);

        ArrayList<Teacher> teachers = new ArrayList<>();
        System.out.println("Информация о преподавателях.");
        fillTeachersList(countOfTeachers, teachers);

        findStudents(students);
        findTeachers(teachers);
    }

    private static void fillStudentsList(int countOfStudents, ArrayList<Student> students) throws ValidationException {
        for (int i = 0; i < countOfStudents; i++) {
            System.out.println("Студент №" + (i + 1));
            Student student = new Student();
            student.input();
            students.add(student);
            System.out.println();
        }
    }

    private static void fillTeachersList(int countOfTeachers, ArrayList<Teacher> students) throws ValidationException {
        for (int i = 0; i < countOfTeachers; i++) {
            System.out.println("Преподаватель №" + (i + 1));
            Teacher teacher =  new Teacher();
            teacher.input();
            students.add(teacher);
            System.out.println();
        }
    }

    public static void findStudents(ArrayList<Student> students) {
        // return students.Where(student => student.Gender.equals("женский") && student.Year == 2014);

        for (int i = 0; i < students.size(); i++) {
            if ((students.get(i).getGender().equals("женский")) && (students.get(i).getYearOfStart() == 2014)) {
                System.out.println(students.get(i) + "; ");
            }
        }
        System.out.println();
    }

    public static void findTeachers(ArrayList<Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).isCurator())
                System.out.println(teachers.get(i) + "; ");
        }

    }


}


