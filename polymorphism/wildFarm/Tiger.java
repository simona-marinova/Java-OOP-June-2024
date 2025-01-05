package polymorphism.wildFarm;

import java.text.DecimalFormat;

public class Tiger extends Felime {


    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.eat(food);
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df= new DecimalFormat ("#.##");
        return String.format("Tiger[%s, %s, %s, %s]", animalName,df.format(animalWeight),livingRegion, foodEaten);
    }
}


