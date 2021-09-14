package ru.neo;

public class Main {

    public static void main(String[] args) {
        Mattress matr1 = new Mattress(200,200, 20);
        Mattress matr2 = new Mattress(200,220, 30);
        Mattress matr3 = new Mattress(130, 140, 15);

        matr1.manufacturerName("Matr1");
        matr2.manufacturerName("Matr2");
        System.out.println();

        matr1.setDensity("high density");
        matr2.setDensity("low density");
        matr3.setDensity("super density");
        System.out.println();

        matr2.setSheetSize(200,220, 30);
        matr3.setSheetSize(130, 140, 15);
        System.out.println();

        System.out.print("Matr1 ");
        matr1.setStandBedSheets(200,200);
        System.out.print("Matr2 ");
        matr2.setStandBedSheets(220,220);
        System.out.print("Matr3 ");
        matr3.setStandBedSheets(130, 140);
    }
}
