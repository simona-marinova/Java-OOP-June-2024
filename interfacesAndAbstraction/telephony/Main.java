package interfacesAndAbstraction.telephony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        List<String> urls = new ArrayList<>();

        String[] numbersArray = scanner.nextLine().split("\\s+");
        String[] urlsArray = scanner.nextLine().split("\\s+");

        for (int i = 0; i < numbersArray.length; i++) {
            numbers.add(numbersArray[i]);
        }

        for (int i = 0; i < urlsArray.length; i++) {
            urls.add(urlsArray[i]);
        }

        Smartphone smartphone = new Smartphone(numbers, urls);
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());

    }
}
