package com.fotuoc;

public class Vehicle implements Running {

    private int id;
    private String licenseNumber;
    public double engineSize;

    public Vehicle() {

    }

    public Vehicle(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Vehicle(String licenseNumber, boolean isReady){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (validateLicenseNumber())
            this.licenseNumber = licenseNumber;
        else
            this.licenseNumber = "";
    }

    private boolean validateLicenseNumber() {
        return true;
    }

    public void run() {

        checkEngine();
        System.out.println("Vehicle is running");
    }

    public void run(boolean isHealthy) {

        checkEngine();
        System.out.println("Vehicle is running");
    }


    @Override
    public void checkEngine() {
        System.out.println("Checking engine started");
        System.out.println("Checking engine completed");
    }
}
