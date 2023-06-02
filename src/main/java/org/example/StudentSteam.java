package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> steam;
    private int idSteam;

    public int getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(int idSteam) {
        this.idSteam = idSteam;
    }

    public StudentSteam(List<StudentGroup> steam, int idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter<steam.size();
            }

            @Override
            public StudentGroup next() {
                if(!hasNext()) return null;
                return steam.get(counter++);
            }
        };
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "idSteam=" + idSteam +
                "QuantityGroup=" + steam.size() +
                "steam=" + steam +
                '}';
    }
}
