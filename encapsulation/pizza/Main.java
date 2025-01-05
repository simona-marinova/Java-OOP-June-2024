//package encapsulation.pizza;
package pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Pizza {pizzaName} {numberOfToppings}
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        String pizzaName = firstLine[1];
        int numberOfToppings = Integer.parseInt(firstLine[2]);
        Pizza pizza = new Pizza(pizzaName, numberOfToppings);
        String[] secondLine = scanner.nextLine().split(" ");
//Dough {flourType} {bakingTechnique} {weightInGrams}
        String flourType = secondLine[1];
        String bakingTechnique = secondLine[2];
        double weight = Double.parseDouble(secondLine[3]);
        Dough dough = new Dough(flourType, bakingTechnique, weight);
        pizza.setDough(dough);
        String toppingCommand = scanner.nextLine();

        while (!toppingCommand.equals("END")) {
            //Topping {toppingType} {weightInGrams}
            String[] toppingInfo = toppingCommand.split(" ");
            String toppingType = toppingInfo[1];
            double toppingWeight = Double.parseDouble(toppingInfo[2]);
            Topping topping = new Topping(toppingType, toppingWeight);
            pizza.addTopping(topping);
            toppingCommand = scanner.nextLine();
        }

        System.out.println(pizza.toString());

    }
}
