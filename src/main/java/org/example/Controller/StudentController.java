package org.example.Controller;

import org.example.Domen.Student;
import org.example.Service.StudentService;

/**
 * Класс, управляющий поведением студентов
 */
public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();

    /**
     * Метод создания студента с использованием Сервиса
     * @param firstName
     * @param secondName
     * @param age
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
}