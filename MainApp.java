package com.university.main;

import com.university.model.student;

public class MainApp {
    public static void main(String[] args) {
        student[] students = new student[5];
        students[0] = new student("S001", "Alice", 20, 3.8);
        students[1] = new student("S002", "Bob", 22, 3.6);
        students[2] = new student("S003", "Charlie", 21, 3.9);
        students[3] = new student("S004", "David", 23, 3.7);
        students[4] = new student("S005", "Eve", 19, 3.5);

        System.out.println("=== Data Mahasiswa ===");
        for (student student : students) {
            System.out.println("ID : " + student.getStudentId() + ", Nama : " + student.getName() + ", Umur : " + student.getAge() + ", GPA : " + student.getGpa());
        }
    }
}