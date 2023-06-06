package org.example.Domen;

import java.util.Comparator;

/**
 * Класс для сравнения наследников класса Person
 * @param <T> Параметрический тип передаваемого объекта, которым могут являться Person и его наследник
 */
public class PersonComparator<T extends Person> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultComparing == 0)
        {
            resultComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultComparing;
        } else {
            return resultComparing;
        }
    }
}
