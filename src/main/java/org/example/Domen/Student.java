package org.example.Domen;

/**
 * Класс студентов, наследует класс Person имплементирует интерфейс Comparable для сортировки студентов по возрасту
 */
public class Student extends Person implements Comparable<Student> {

    private int id;

    public Student(String firstName, String secondName, int age, int id) {
        super(firstName, secondName, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        if (o.getAge() > this.getAge()) {
            return -1;
        } else if (o.getAge() < this.getAge()) {
            return 1;
        } else return 0;
    }
}

