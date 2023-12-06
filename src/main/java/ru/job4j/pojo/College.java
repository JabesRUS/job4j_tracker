package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Сергей Сергеевич");
        student.setGroupNumber(6);
        student.setDateReceipt(LocalDate.now());
        System.out.println("ФИО: " + student.getFio());
        System.out.println("Группа: " + student.getGroupNumber());
        System.out.println("Дата поступления: " + student.getDateReceipt());
    }
}
