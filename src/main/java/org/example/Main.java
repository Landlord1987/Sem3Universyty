package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person man = new Person("Денис", "Криницын", 35);
        //System.out.println(man.toString());
/**
 * Экземпляры класса студентов
 */
        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        //System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 31, 101);
        Student s2 = new Student("Андрей", "Сидоров", 28, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 26, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
/**
 * Создаем список студентов
 */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);


        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s5);
        listStud2.add(s6);
        listStud2.add(pers1);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s1);
        listStud3.add(s4);
        listStud3.add(s6);
/**
 * Создаем группу студентов, добавляем в нее список студентов и номер группы
 */
        StudentGroup group4335 = new StudentGroup(listStud1, 4335);
        //System.out.println(group4335.toString());
        StudentGroup group3836 = new StudentGroup(listStud2, 3836);
        StudentGroup group236 = new StudentGroup(listStud2, 236);

        List<StudentGroup> studentGroups = new ArrayList<StudentGroup>();
        studentGroups.add(group4335);
        studentGroups.add(group3836);
        studentGroups.add(group236);

        StudentSteam studentSteam1 = new StudentSteam(studentGroups, 1);
/**
 * Перебираем коллекции каждого студента группы с помощью итератора
 */
        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }

        System.out.println("===============================");
        /**
         * Вызываем класс Collection.sort и сортируем по возрасту с помощью интерфейса Comparable
          */
        Collections.sort(group4335.getGroup());

        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }
/**
 * Перебираем коллекции каждой группы с помощью итератора
 */
        for (StudentGroup studentGroup: studentGroups) {
            System.out.println(studentGroup.toString());
        }

        System.out.println("===============================");
        /**
         * Вызываем класс Collection.sort и сортируем по количеству студентов с помощью интерфейса Comparable
         */
        Collections.sort(studentSteam1.getSteam());

        for (StudentGroup studentGroup: studentGroups) {
            System.out.println(studentGroup.toString());
        }
    }

}