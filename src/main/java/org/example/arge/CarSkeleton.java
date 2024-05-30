package org.example.arge;

import java.sql.SQLOutput;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        printSimpleName();
        return getName()+"'s engine is starting";
    }

    private void printSimpleName() {
        System.out.println("Class: "+getClass().getSimpleName());
    }

    public String drive(){
        this.runEngine(this);
        printSimpleName();
        return getName()+" is being driven";
    }

    protected void runEngine(CarSkeleton carSkeleton){

    }
}
