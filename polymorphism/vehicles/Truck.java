package polymorphism.vehicles;

public class Truck extends Vehicle {


    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm + 1.6);
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
