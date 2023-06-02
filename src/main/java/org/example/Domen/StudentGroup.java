package org.example.Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс группы студентов, который имплементирует интерфейс Итерирования
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    List<Student> group;
    private int idGroup;


    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                ", quantity=" + group.size() +
                '}';
    }

    /**
     * Метод итерирования
     * @return коллекцию атрибутов студента
     */
    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>()
        {
            private int counter;

            /**
             * метод проверяет, является ли текущий элемент последним
             * @return
             */
            @Override
            public boolean hasNext() {
                return counter<group.size();
            }

            /**
             * Метод переключения на следующий элемент коллекции
             * @return Следующий элемент коллекции
             */
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                return group.get(counter++);
            }
        };

        //return new SGIterator(group);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (o.group.size() > this.group.size()) {
            return -1;
        } else if (o.group.size() < this.group.size()) {
            return 1;
        } else return 0;
    }
}
