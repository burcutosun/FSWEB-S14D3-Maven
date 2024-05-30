package org.example.company;

import java.util.Objects;

public class Car {
    private int cylinders;
    private boolean engine;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.engine=true;
        this.name = name;
        this.wheels=4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }

    private void printSimpleName() {
        System.out.println("Class: "+getClass().getSimpleName());
    }

    public String accelerate(){
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake(){
        printSimpleName();
        return "the car is braking";
    }
}
