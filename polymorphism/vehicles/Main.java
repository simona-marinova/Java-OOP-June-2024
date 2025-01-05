package polymorphism.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        //Car {fuel quantity} {liters per km}".
        double fuel = Double.parseDouble(carInfo[1]);
        double fuelLitersPerKm = Double.parseDouble(carInfo[2]);
        Car car = new Car(fuel, fuelLitersPerKm);
        String[] truckInfo = scanner.nextLine().split("\\s+");
        //Truck {fuel quantity} {liters per km}".
        double truckFuel = Double.parseDouble(truckInfo[1]);
        double truckFuelLitersPerKm = Double.parseDouble(truckInfo[2]);
        Truck truck = new Truck(truckFuel, truckFuelLitersPerKm);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] commandInfo = scanner.nextLine().split("\\s+");
            double distance = Double.parseDouble((commandInfo[2]));
            if (commandInfo[0].equals("Drive")) {
                if (commandInfo[1].equals("Car")) {
                    car.drive(distance);

                } else if (commandInfo[1].equals("Truck")) {
                    truck.drive(distance);
                }
            } else if (commandInfo[0].equals("Refuel")) {
                if (commandInfo[1].equals("Car")) {
                    car.refuel(Double.parseDouble(commandInfo[2]));
                } else if (commandInfo[1].equals("Truck")) {
                    truck.refuel(Double.parseDouble(commandInfo[2]));
                }
            }
        }
        System.out.print(car);
        System.out.print(truck);

    }
}
