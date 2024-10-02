package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus is moving");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping");
    }
}
