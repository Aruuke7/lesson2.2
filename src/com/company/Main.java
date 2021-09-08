package com.company;

public class Main {

    public static void main(String[] args) {

    Appliances appliances[] = {createObject("Tv"), createObject("Refrigerator"),
        createObject("Washer")};

        for (Appliances appliance: appliances) {
            appliance.print();
            System.out.println("____________________________________");

        }


    }

    public static Appliances createObject(String className) {
        switch (className) {
            case "Tv":
                Tv tv = new Tv(Brand.SAMSUNG, "ST200316-T", "96'");
                return tv;

            case "Refrigerator":
                Refrigerator refrigerator = new Refrigerator(Brand.BEKO, 60, 185, 67, 230);
                return refrigerator;

            case "Washer":
                Washer washer = new Washer(Brand.LG, Color.GRAY, 6);
                return washer;

            default: return null;
        }
    }
}
