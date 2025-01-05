package polymorphism.wildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();
        List<Animal> animals = new ArrayList<>();

        while (!info.equals("End")) {
            String[] animalInformation = info.split("\\s+");
            Animal animal = new Cat("", "", 0.00, "", "");
            if (animalInformation.length == 5) {
                //is a cat
                String animalType = animalInformation[0];
                String animalName = animalInformation[1];
                Double animalWeight = Double.parseDouble(animalInformation[2]);
                String animalLivingRegion = animalInformation[3];
                String catBreed = animalInformation[4];
                animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
            } else {
                String animalType = animalInformation[0];
                String animalName = animalInformation[1];
                Double animalWeight = Double.parseDouble(animalInformation[2]);
                String animalLivingRegion = animalInformation[3];
                switch (animalType) {
                    case "Tiger":
                        animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                        break;
                    case "Zebra":
                        animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                        break;
                    case "Mouse":
                        animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                        break;
                }
            }
            animals.add(animal);
            String[] foodInfo = scanner.nextLine().split("\\s+");
            Food food = new Vegetable(0);
            if (foodInfo[0].equals("Vegetable")) {
                food = new Vegetable(Integer.parseInt(foodInfo[1]));
            } else {
                food = new Meat(Integer.parseInt(foodInfo[1]));
            }
            animal.makeSound();
            animal.eat(food);
            info = scanner.nextLine();
        }
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
