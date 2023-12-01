package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int a) {
        return x / a;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("5 + 5 = " + sum(num));
        Calculator multiply = new Calculator();
        System.out.println("5 * 5 = " + multiply.multiply(num));
        System.out.println("5 - 5 = " + minus(num));
        Calculator divide = new Calculator();
        System.out.println("5 / 5 = " + divide.divide(num));
        Calculator summ = new Calculator();
        System.out.println("Сумма = " + summ.sumAllOperation(num));

    }
}
