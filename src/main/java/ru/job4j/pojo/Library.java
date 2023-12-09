package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] lib = new Book[4];
        lib[0] = new Book("Physics", 300);
        lib[1] = new Book("Chemistry", 250);
        lib[2] = new Book("Mathematic", 350);
        lib[3] = new Book("Clean code", 1);

        for (int i = 0; i < lib.length; i++) {
            System.out.println("Название книги - " + lib[i].getName()
                    + ", количество страниц - " + lib[i].getCountPage());
        }

        Book temp = lib[0];
        lib[0] = lib[3];
        lib[3] = temp;

        for (int i = 0; i < lib.length; i++) {
            if ("Clean code".equals(lib[i].getName())) {
                System.out.println("Название книги - " + lib[i].getName()
                        + ", количество страниц - " + lib[i].getCountPage());
            }
        }
    }

}
