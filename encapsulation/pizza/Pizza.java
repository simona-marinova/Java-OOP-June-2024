//package encapsulation.pizza;
package pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (name.length() > 15 || name.isEmpty() || name.isBlank() || name == null) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols");
        }
        this.name = name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    //+	getOverallCalories () : double
    public double getOverallCalories() {
        double sumToppingCalories = 0;
        for (Topping topping : toppings) {
            sumToppingCalories += topping.calculateCalories();
        }
        return this.dough.calculateCalories() + sumToppingCalories;
    }

   @Override
    public String toString() {
        return "%s - %.2f".formatted(name, getOverallCalories());
    }
}
