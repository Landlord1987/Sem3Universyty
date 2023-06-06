package org.example.Service;

import org.example.Domen.PersonComparator;
import org.example.Domen.Student;
import org.example.Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс сервис работы с учителем
 */
public class TeacherService implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> teachers;

    /**
     * Конструктор класса
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /**
     * Метод получения списка учителей
     * @return список учителей
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Метод создания нового учителя
     * @param firstName Имя
     * @param secondName Фамилия
     * @param age Возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teacher = new Teacher(firstName, secondName, age);
        count++;
        teachers.add(teacher);
    }

    /**
     * Метод сортировки списка учителей с PersonComparator
     * @return
     */
    public List<Teacher> getSortedByFIOTeachersList()
    {
        List<Teacher> newTechList = new ArrayList<Teacher>(teachers);
        newTechList.sort(new PersonComparator<Teacher>());
        return newTechList;
    }

    /**
     * Метод изменения Фамилии
     * @param teacher конкретный учитель
     * @param secondName фамилии
     */
    public void setSecondName(Teacher teacher, String secondName){
        teacher.setSecondName(secondName);
    }

    /**
     * Метод печати Фамилии
     * @param teacher конкретный учитель
     */
    public void printSecondName(Teacher teacher){
        System.out.println(teacher.getSecondName());;
    }
    /**
     * Метод изменения Возраста
     * @param teacher конкретный учитель
     * @param age возраст
     */
    public void setAge(Teacher teacher, int age){
        teacher.setAge(age);
    }
    /**
     * Метод печати Возраста
     * @param teacher конкретный учитель
     */
    public void printAge(Teacher teacher){
        System.out.println(teacher.getAge());;
    }
    /**
     * Метод изменения Имени
     * @param teacher конкретный учитель
     * @param firstName Имя
     */
    public void setFirstName(Teacher teacher, String firstName){
        teacher.setFirstName(firstName);
    }
    /**
     * Метод печати Имени
     * @param teacher конкретный учитель
     */
    public void printFirstName(Teacher teacher){
        System.out.println(teacher.getFirstName());;
    }
}
