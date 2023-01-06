package oop.objectoriented.exercises.library;

import oop.objectoriented.exercises.library.Student;

import java.util.Date;

/**
 * Rent implements a rent of an Item for a delimited time frame
 */
public class Rent {
    Item item;
    Student student;
    Date begin;
    Date end;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.student = student;
        this.begin = begin;
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Rent{" 
            + "item=" + item 
            + ", student=" + student 
            + ", begin=" + begin 
            + ", end=" + end 
            + '}';
    }
}
