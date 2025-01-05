package vehiclesExtended;


public class Car extends Vehicle {


    public Car(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm + 0.9, tankCapacity);
    }


    @Override
    public void refuel(double fuelToRefill) {
        super.refuel(fuelToRefill);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f\n", this.getFuelQuantity());
    }
}
