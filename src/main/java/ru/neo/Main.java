package ru.neo;

public class Main {

    public static void main(String[] args) {
        Mattress matr1 = new Mattress(200,180, 20);
        Mattress matr2 = new Mattress(210,200, 30);
        Mattress matr3 = new Mattress(130, 140, 15);

        matr1.manufacturerName("Matr1");
        matr2.manufacturerName("Matr2");

        matr1.setDensity("high density");
        matr2.setDensity("low density");
        matr3.setDensity("super density");
    }
}
