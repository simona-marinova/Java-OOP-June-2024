package vehiclesExtended;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        //Car {fuel quantity} {liters per km}".
        double fuel = Double.parseDouble(carInfo[1]);
        double fuelLitersPerKm = Double.parseDouble(carInfo[2]);
        double tankCapacity = Double.parseDouble(carInfo[3]);
        Car car = new Car(fuel, fuelLitersPerKm, tankCapacity);
        String[] truckInfo = scanner.nextLine().split("\\s+");
        //Truck {fuel quantity} {liters per km}".
        double truckFuel = Double.parseDouble(truckInfo[1]);
        double truckFuelLitersPerKm = Double.parseDouble(truckInfo[2]);
        double truckCapacity = Double.parseDouble(truckInfo[3]);
        Truck truck = new Truck(truckFuel, truckFuelLitersPerKm, truckCapacity);
        String[] busInfo = scanner.nextLine().split("\\s+");
        //Truck {fuel quantity} {liters per km}".
        double busFuel = Double.parseDouble(busInfo[1]);
        double busFuelLitersPerKm = Double.parseDouble(busInfo[2]);
        double busCapacity = Double.parseDouble(busInfo[3]);
        Bus bus = new Bus(busFuel, busFuelLitersPerKm, busCapacity);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] commandInfo = scanner.nextLine().split("\\s+");
            double distance = Double.parseDouble((commandInfo[2]));
            if (commandInfo[0].equals("Drive")) {
                if (commandInfo[1].equals("Car")) {
                    car.drive(distance);

                } else if (commandInfo[1].equals("Truck")) {
                    truck.drive(distance);
                } else if (commandInfo[1].equals("Bus")) {
                    bus.driveWithPeople(distance);
                }
            } else if (commandInfo[0].equals("Refuel")) {
                if (commandInfo[1].equals("Car")) {
                    car.refuel(Double.parseDouble(commandInfo[2]));
                } else if (commandInfo[1].equals("Truck")) {
                    truck.refuel(Double.parseDouble(commandInfo[2]));
                } else if (commandInfo[1].equals("Bus")) {
                    bus.refuel(Double.parseDouble(commandInfo[2]));
                }
            } else if (commandInfo[0].equals("DriveEmpty")) {
                bus.drive(distance);
            }
        }
        System.out.print(car);
        System.out.print(truck);
        System.out.println(bus);

    }
}
