package com.company;

public class Main {

    public static void main(String[] args) {

	System.out.println("Stashing Project");

    for (int i = 0; i < 100; i++){
        System.out.print(i + " ");
    }

    BasicFeatures car = new BasicFeatures();
    car.color = "red";
    car.doors = "4";
    car.engineCapac = "V8";
    car.headlights = "blue";
    car.regNo = "tuzik";

    System.out.println("Car is " + car.color + " and it has " + car.doors + " and engine is " + car.engineCapac
            + " and headlights are " + car.headlights + " and reg number is " + car.regNo);




    }
}
