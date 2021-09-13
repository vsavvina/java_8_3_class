package ru.neo;

public class Mattress {
    int length;
    int width;
    int height;
    String density;

    String significance;

    public Mattress(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void manufacturerName (String name) {
        if (width > 180 || density == "high density") {
            System.out.println(name + " двухместный");
        }
        else
            System.out.println(name + " полуторка");
    }

    void setDensity (String density) {
        switch (density) {
            case "high density":
                significance = "high density";
                System.out.println("Suitable for scoliosis for " + density);
                break;
            case "low density":
                significance = "low density";
                System.out.println("Требуется консультация специалиста при" + density);
                break;
            default:
                System.out.println("Уточните корректность плотности при параметре " + density);
        }
    }

//    void
}
