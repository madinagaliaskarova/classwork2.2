package com.company;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {
                new Square(3),
                new Square(5),
                new Rectangle(7, 6),
                new Rectangle(9, 11),
                new Rectangle(12, 9)};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].info());

        }
    }
}

