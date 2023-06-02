package org.example;

import java.util.Iterator;
import java.util.List;

/**
 * Класс итератор
 */
public class SGIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    public SGIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return counter<students.size();
    }

    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        return students.get(counter++);
    }

}
