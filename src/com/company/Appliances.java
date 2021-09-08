package com.company;

public class Appliances implements Printable {

    private Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public Appliances(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void print() {

    }

}
