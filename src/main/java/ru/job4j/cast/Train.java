package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train move");
    }

    @Override
    public void stop() {
        System.out.println("Train stop");
    }
}
