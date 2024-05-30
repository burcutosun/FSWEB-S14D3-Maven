package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+"'s engine is starting";
    }

    @Override
    public String drive() {
        return "runs by gas powered car";
    }
}
