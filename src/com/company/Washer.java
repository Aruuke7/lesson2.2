package com.company;

public class Washer extends Appliances {
    private int maximumLoadOfLaundry;
    private Color color;

    public int getMaximumLoadOfLaundry() {
        return maximumLoadOfLaundry;
    }

    public Color getColor() {
        return color;
    }

    public Washer(Brand brand, Color color, int maximumLoadOfLaundry) {
        super(brand);
        this.maximumLoadOfLaundry = maximumLoadOfLaundry;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Стиральная машина \nПроизводитель: " + getBrand() +
                "\nЦвет:" + color + "\nМаксимальная загрузка белья:" + maximumLoadOfLaundry + "кг");
    }
}
