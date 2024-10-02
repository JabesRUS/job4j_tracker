package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Airplane move");
    }

    @Override
    public void stop() {
        System.out.println("Airplane stop");
    }
}
