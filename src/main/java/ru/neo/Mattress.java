package ru.neo;

public class Mattress {
    int length;
    int width;
    int height;

    public Mattress(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void manufacturerName (String name) {
        if (width > 200 || height > 25) {
            System.out.println(name + " is double");
        }
        else
            System.out.println(name + " is one and a half ");
    }

    void setDensity (String density) {
        switch (density) {
            case "high density":
                //significance = "high density";
                System.out.println("Suitable for scoliosis for - " + density);
                break;
            case "low density":
                //significance = "low density";
                System.out.println("A specialist's consultation is required with the parameter = " + density);
                break;
            default:
                System.out.println("Specify the correctness of the density for the parameter = " + density);
        }
    }

    public void setSheetSize (int length, int width, int height) {
        if (length > 190 & width > 190 & height > 25 ) {
            int shLength = length + 5;
            int shWidth = width + 5;
            int shHeight = height + 7;
            System.out.println("Length/width/height of the sheet with an elastic band: " + shLength + "/" + shWidth + "/" + shHeight);
        }
        else {
            System.out.println("The size of the sheet corresponds to the size of the mattress");
        }
    }

    public void setStandBedSheets (int length, int width) {
        if (length == 200 & width == 200) {
            System.out.println("Euro sheets");
            return;
        }
        if (length == 220 & width == 220) {
            System.out.println("Super-euro sheets");
        }
        else {
            System.out.println("Custom sheet");
        }
    }
}
