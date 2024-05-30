package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar=new ElectricCar("Tesla","Tesla desc.",700,2000);
        CarSkeleton gasPoweredCar=new GasPoweredCar("Honda","Honda desc",30,4);
        CarSkeleton hybridCar=new HybridCar("Toyota","Toyota desc.",40,4000,4);
        startEngine(electricCar);
        startEngine(gasPoweredCar);
        startEngine(hybridCar);
    }
    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}
