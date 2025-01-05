package vehiclesExtended;

public class Truck extends Vehicle {


    public Truck(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm + 1.6, tankCapacity);
    }


    @Override
    public void refuel(double fuelToRefill) {
        double realFuelToRefill = fuelToRefill * 0.95;
        super.refuel(realFuelToRefill);
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f\n", this.getFuelQuantity());
    }
}
