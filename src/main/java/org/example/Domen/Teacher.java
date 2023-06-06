package org.example.Domen;

public class Teacher extends Person {
    static private int id;
    private String acadDegree;

    public static int getId() {
        return id;
    }

    public Teacher(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
        id++;
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }
}
