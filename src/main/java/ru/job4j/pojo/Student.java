package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {

    private String fio;
    private int groupNumber;
    private LocalDate dateReceipt;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public LocalDate getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(LocalDate dateReceipt) {
        this.dateReceipt = dateReceipt;
    }
}
