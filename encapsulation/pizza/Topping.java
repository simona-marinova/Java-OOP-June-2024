//package encapsulation.pizza;
package pizza;

public class Topping {

    private String toppingType; //meat, veggies, cheese, or sauce
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if(!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese")
    && !toppingType.equals("Sauce")){
            throw new IllegalArgumentException("Cannot place %s on top of your pizza.".formatted(toppingType));
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if(weight<1 || weight>50){
            throw new IllegalArgumentException("%s weight should be in the range [1..50].".formatted(weight));
        }
        this.weight = weight;
    }


    //+	calculateCalories (): double
    //Every ingredient has 2 calories per gram as a base and a modifier that gives the exact calories.
    // Toppings Modifiers
    //•	Meat – 1.2;
    //•	Veggies – 0.8;
    //•	Cheese – 1.1;
    //•	Sauce – 0.9;

    public double calculateCalories() {
        double modifier = 0;
        switch (toppingType) {
            case "Meat" -> modifier = 1.2;
            case "Veggies" -> modifier = 0.8;
            case "Cheese" -> modifier = 1.1;
            case "Sauce" -> modifier = 0.9;
        }
        return 2*weight*modifier;
    }
}
