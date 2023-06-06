package org.example.Controller;

import org.example.Domen.Person;

/**
 * Интерфейс управления классом person и его наследниками
 * @param <T> параметризованный тип объекта, которыми могут быть класс Person и его наследники
 */
public interface iPersonController <T extends Person> {
    void create(String firstName, String secondName, int age);
}
