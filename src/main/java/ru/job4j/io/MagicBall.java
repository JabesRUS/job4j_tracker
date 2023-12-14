package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = new Random().nextInt(3);
        String res = "";
        if (answer == 0) {
            res = "Да";
        } else if (answer == 1) {
            res  = "Нет";
        } else {
            res  = "Может быть";
        }
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        System.out.print(res);

    }
}
