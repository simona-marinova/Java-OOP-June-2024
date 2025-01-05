package polymorphism.wildFarm;

import java.text.DecimalFormat;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.eat(food);
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df= new DecimalFormat ("#.##");
        return String.format("Mouse[%s, %s, %s, %s]", animalName,df.format(animalWeight),livingRegion, foodEaten);
    }
}


