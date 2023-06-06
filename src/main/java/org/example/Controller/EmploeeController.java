package org.example.Controller;

import org.example.Domen.Emploee;
import org.example.Service.EmploeeService;

/**
 * Класс, отвечающий за управление поведением работников
 */
public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService empServ = new EmploeeService();

    /**
     * Метод созадния нового сотрудника с применением сервиса создания
     * @param firstName Имя
     * @param secondName Фамилия
     * @param age Возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        empServ.create(firstName, secondName, age);
    }

    /**
     * Параметрический метод выплаты зарплату объектам класса Emploee и его наследникам
     * @param person
     * @param <T>
     */
    public <T extends Emploee> void paySalary(T person)
    {
        System.out.println(person.getFirstName() + " выплачена зарплата 10_000р.");

    }
}
