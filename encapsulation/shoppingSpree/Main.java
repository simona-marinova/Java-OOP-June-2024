package encapsulation.shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstCommand = scanner.nextLine();
        String[] peopleInfo = firstCommand.split(";");
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        for (String currentInfo : peopleInfo) {
            String[] personInfo = currentInfo.split("=");
            String name = personInfo[0];
            double money = Double.parseDouble(personInfo[1]);
            Person person = new Person(name, money);
            people.add(person);
        }
        String secondCommand = scanner.nextLine();
        String[] productInfo = secondCommand.split(";");
        for (String currentInfo : productInfo) {
            String[] productInformation = currentInfo.split("=");
            String name = productInformation[0];
            double cost = Double.parseDouble(productInformation[1]);
            Product product = new Product(name, cost);
            products.add(product);
        }

        String buyingInfo = scanner.nextLine();
        while (!buyingInfo.equals("END")) {
            String[] info = buyingInfo.split(" ");
            String personName = info[0];
            String productName = info[1];
            Person person = people.stream().filter(p -> p.getName().equals(personName)).findFirst().get();
            Product product = products.stream().filter(p -> p.getName().equals(productName)).findFirst().get();
            person.buyProduct(product);
            buyingInfo = scanner.nextLine();
        }

        }
    }
