package workingWithAbstraction.hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String information = scanner.nextLine();
        String[] info = information.split("\\s+");

        //"{pricePerDay} {numberOfDays} {season} {discountType}",

        double price = Double.parseDouble(info[0]);
        int numberOfDays = Integer.parseInt(info[1]);
        String season = info[2];
        String discount = info[3];
        Season seasonObject = Season.valueOf(season.toUpperCase());
        double cost = price * numberOfDays * seasonObject.getMultiplier();
        DiscountType discountType = DiscountType.getDiscountType(discount);
        double finalPrice = cost - cost*discountType.getDiscountPercentage()/100;
        System.out.printf("%.2f", finalPrice);

    }
}
