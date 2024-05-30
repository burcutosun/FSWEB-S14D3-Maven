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
        if(carSkeleton instanceof ElectricCar){
            ElectricCar electricCar=(ElectricCar) carSkeleton;
            System.out.println("Electric car's engine is running. Per charge: "+ electricCar.getAvgKmPerCharge()+" Battery size: "+electricCar.getBatterySize());
        }else if(carSkeleton instanceof GasPoweredCar){
            GasPoweredCar gasPoweredCar=(GasPoweredCar) carSkeleton;
            System.out.println("Gas powered car's engine is running. Per liter: "+ gasPoweredCar.getAverageKmPerLiter()+" Cylinders: "+gasPoweredCar.getCylinders());
        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar=(HybridCar) carSkeleton;
            System.out.println("Hybrid car's engine is running. Per liter: "+ hybridCar.getAvgKmPerLiter()+" Battery size: "+hybridCar.getBatterySize()+" Cylinders: "+hybridCar.getCylinders());
        }else{
            System.out.println("Invalid car type.");
        }
    }
}
