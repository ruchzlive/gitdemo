package com.fotuoc;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Car> carList;

    private static String[] mainMenu = {"1- Add Car",
            "2- Add Bike",
            "4- Exit",
    };

    private static String[] bikeMenu = {"1- Add Normal Bike",
            "2- Add Racing Bike",
            "3- Back",
    };
    
    public static void printSample01(){
        System.out.print("This is a sample print method 01");
    }

    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    public static void addCar(Scanner scanner){
        System.out.print("License No: ");
        String licenseNumber = scanner.next();

        boolean isValid = false;

        while (!isValid){
            if (licenseNumber.isEmpty()) {
                System.out.println("Invalid License No:");

                System.out.print("License No: ");
                licenseNumber = scanner.next();
            }

            // Validations successful
            if (!licenseNumber.isEmpty()){
                break;
            }
        }

        // Save created car object in ArrayList
        Car c = new Car(licenseNumber);
        carList.add(c);
    }

    public static void addBike(Scanner scanner){
        boolean isValid = false;

        while (true){
            printMenu(bikeMenu);
            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Add Normal Bike");
                    // Process add normal bike
                    break;
                case 2:
                    System.out.println("Add Racing Bike");
                    // Process add racing bike
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    public static void main(String[] args) {

        //Create Data Structures
        carList = new ArrayList<Car>();

        Scanner scanner = new Scanner(System.in);

        int option;
        while (true){
            printMenu(mainMenu);
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Add New Car");
                    addCar(scanner);
                    break;
                case 2:
                    printMenu(bikeMenu);
                    addBike(scanner);
                    break;
                case 4:
                    System.out.println("Exit...");
                    System.out.println("------ Developer Credits -----");
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
