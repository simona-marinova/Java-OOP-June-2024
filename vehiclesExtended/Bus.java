package vehiclesExtended;

import java.text.DecimalFormat;

public class Bus extends Vehicle {

    public Bus(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
    }

    public void driveWithPeople (double distance) {
        double newFuelConsumption = this.getFuelConsumptionPerKm()+1.4;
        DecimalFormat df = new DecimalFormat("#.##");
        if(distance*newFuelConsumption<=this.getFuelQuantity()){
            System.out.printf("%s travelled %s km\n", this.getClass().getSimpleName(), df.format(distance));
           this.setFuelQuantity(this.getFuelQuantity()-distance*newFuelConsumption);
        }
        else {
            System.out.printf("%s needs refueling\n", this.getClass().getSimpleName());
        }
    }
    @Override
    public String toString() {
        return String.format("Bus: %.2f\n", this.getFuelQuantity());
    }
}
