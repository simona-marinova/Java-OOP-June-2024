package encapsulation.shoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if(name==null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money<0){
            throw new IllegalArgumentException("Money cannot be negative\n");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() > money) {
            String message = "%s can't afford %s\n".formatted(name, product.getName());
            throw new IllegalArgumentException(message);
        }
        products.add(product);
        money-= product.getCost();
        System.out.printf("%s bought %s\n",name, product.getName());
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
