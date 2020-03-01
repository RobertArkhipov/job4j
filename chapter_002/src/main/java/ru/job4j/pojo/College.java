package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Petrov Ivan Ivanovich");
        student.setGroup(102);
        student.setCreated(new Date());

        System.out.println("Student: " + student.getFullName()
                + System.lineSeparator() + "Group: " + student.getGroup()
                + System.lineSeparator() + "Date of admission: " + student.getCreated());
    }
}
