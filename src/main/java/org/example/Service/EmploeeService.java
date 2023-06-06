package org.example.Service;

import org.example.Domen.Emploee;
import org.example.Domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис создания списка работников
 */
public class EmploeeService implements iPersonService<Emploee> {

    private int count;
    private List<Emploee> emploees;

    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    /**
     * Метод получения списка всех работников
     * @return список работников
     */
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    /**
     * Метод создания работника
     * @param firstName Имя
     * @param secondName Фамилия
     * @param age Возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Emploee per = new Emploee(firstName, secondName, age, "basic");
        count++;
        emploees.add(per);
    }

    /**
     * Метод сортировки списка работников с применение компаратора PersonComparator
     * @return Отсортированный список работников
     */
    public List<Emploee> getSortedByFIOEmploeeList()
    {
        List<Emploee> newEmploiList = new ArrayList<Emploee>(emploees);
        newEmploiList.sort(new PersonComparator<Emploee>());
        return newEmploiList;
    }
}
