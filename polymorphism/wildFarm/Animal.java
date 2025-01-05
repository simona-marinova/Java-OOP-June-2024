package polymorphism.wildFarm;

public abstract class Animal {
    protected final String animalName;
    protected final String animalType;
    protected final Double animalWeight;
    protected Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public abstract void makeSound();

    public  void eat(Food food) {
        foodEaten+=food.getQuantity();
    }

}