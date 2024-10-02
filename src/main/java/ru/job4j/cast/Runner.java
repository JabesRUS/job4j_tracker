package ru.job4j.cast;

public class Runner {
    public static void main(String[] args) {

        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = {airplane, train, bus};
        for (Vehicle object : vehicles) {
            object.move();
            object.stop();
        }
    }
}
