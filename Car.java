package com.fotuoc;

public class Car extends Vehicle {

    private String windScreenColor;

    public String getWindScreenColor() {
        return windScreenColor;
    }

    public void setWindScreenColor(String windScreenColor) {
        this.windScreenColor = windScreenColor;
    }

    public Car(String licenseNo) {
        super(licenseNo);
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }
}
