package org.example.Service;

import org.example.Domen.PersonComparator;
import org.example.Domen.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс сервис по созданиюсписка студентов, сортировки и возврата списка студентов
 */
public class StudentService implements iPersonService<Student>{
    private int count;
    private List<Student> students;

    /**
     * Конструктор класса создает новый список
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /**
     * Метод получения списка студентов
     * @return список студентов
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     * Метод создания/добавления нового студента в списке
     * @param firstName Имя
     * @param secondName Фамилия
     * @param age Возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }

    /**
     * Метод сортировки списка студентов с применением класса PersonComparator
     * @return отсортированный список студентов
     */
    public List<Student> getSortedByFIOStudentsList()
    {
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new PersonComparator<Student>());
        return newStudList;
    }
}
