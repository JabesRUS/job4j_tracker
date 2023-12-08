package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(11, "Василий");
        System.out.printf(item.toString());
        //System.out.printf(item); // - на такое написание ругается IDEA - "wrap using"
    }
}
