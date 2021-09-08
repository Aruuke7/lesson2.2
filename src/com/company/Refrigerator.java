package com.company;

public class Refrigerator extends Appliances{
    private int volume;
    private int width;
    private int height;
    private int depth;

    public int getVolume() {
        return volume;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public Refrigerator(Brand brand, int width, int height, int depth, int volume) {
        super(brand);
        this.volume = volume;
        this.depth = depth;
        this.height = height;
        this.width = width;

    }

    @Override
    public void print() {
        System.out.println("\nХолодильник \nПроизводитель: " + getBrand() + "\nОбъем холодильной камеры:" + volume + "л" +
                "\nГабариты: Ширина: " + width  + "см, Высота:" + height + "см, Глубина:" + depth);
    }
}
