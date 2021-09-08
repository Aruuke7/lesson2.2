package com.company;

public class Tv extends Appliances{
    private String diagonal;
    private String model;

    public String getDiagonal() {
        return diagonal;
    }

    public String getModel() {
        return model;
    }

    public Tv(Brand brand, String model, String diagonal) {
        super(brand);
        this.diagonal = diagonal;
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Телевизор \nПроизводитель: " + getBrand() +
                "\nМодель:" + model + "\nДиагональ:" + diagonal);
    }
}
