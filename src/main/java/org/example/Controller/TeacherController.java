package org.example.Controller;

import org.example.Domen.Teacher;
import org.example.Service.TeacherService;

import java.util.List;

/**
 * Класс поведения учителей
 */
public class TeacherController implements iPersonController<Teacher> {

    TeacherService techServ = new TeacherService();

    /**
     * Метод создание учителя
     * @param firstName Имя
     * @param secondName Фамилия
     * @param age Возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        techServ.create(firstName, secondName, age);
    }

    /**
     * Метод выплаты зарплаты учителю
     * @param person Конкретный учитель
     * @param <T> Параметрические типы
     */
    public <T extends Teacher> void paySalary(T person){
        System.out.println(person.getFirstName() + "Выплачена зарплата 20_000р.");
    }

    /**
     * Метод изменения Фамилии с помощью сервиса
     * @param teacher Конкретный учитель
     * @param secondName новая Фамилия
     */
    public void setSecondName(Teacher teacher, String secondName){
        techServ.setSecondName(teacher, secondName);
    }

    /**
     * Метод печати фамилии конкретного учителя
     * @param teacher указание на кокретно учителя
     */
    public void printSecondName(Teacher teacher){
        techServ.printSecondName(teacher);
    }
    /**
     * Метод изменения возраста с помощью сервиса
     * @param teacher Конкретный учитель
     * @param age новый возраст
     */
    public void setAge(Teacher teacher, int age){
        techServ.setAge(teacher, age);
    }
    /**
     * Метод печати возраста конкретного учителя
     * @param teacher указание на кокретно учителя
     */
    public void printAge(Teacher teacher){
        techServ.printAge(teacher);
    }
    /**
     * Метод изменения Имени с помощью сервиса
     * @param teacher Конкретный учитель
     * @param firstName новое Имя
     */
    public void setFirstName(Teacher teacher, String firstName){
        techServ.setFirstName(teacher, firstName);
    }
    /**
     * Метод печати имени конкретного учителя
     * @param teacher указание на кокретно учителя
     */
    public void printFirstName(Teacher teacher){
        techServ.printFirstName(teacher);
    }

    /**
     * Метод вывода учителя с применением сервиса
     */
    public void viewListTeacher() {
        System.out.println(techServ.getAll());
    }

}
