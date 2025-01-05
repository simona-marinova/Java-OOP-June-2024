package polymorphism.vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumptionPerKm;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public void drive(double distance){
        DecimalFormat df = new DecimalFormat("#.##");
        if(distance*this.fuelConsumptionPerKm<=this.fuelQuantity){
            System.out.printf("%s travelled %s km\n", this.getClass().getSimpleName(), df.format(distance));
            fuelQuantity-=distance*fuelConsumptionPerKm;
        }
        else {
            System.out.printf("%s needs refueling\n", this.getClass().getSimpleName());
        }
    }

    public  void refuel(double fuelToRefill) {
       fuelQuantity+=fuelToRefill;
    }


    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }
}
