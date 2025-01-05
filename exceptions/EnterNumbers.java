package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterNumbers {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        List<String> numbers = new ArrayList<>();
        int start = 1;
        int end = 100;

        while (numbers.size() < 10) {
            int number = readNumber(start, end, scanner);
            if (number == -1 || number == 0) {
                continue;
            }
            numbers.add(number + "");
            start=number;
        }

        System.out.println(String.join(", ", numbers));
    }

    public static int readNumber(int start, int end, Scanner scanner) {
        int number = 0;
        try {
            number = Integer.parseInt(scanner.nextLine());
            if (number <= start || number >= end) {
                System.out.printf("Your number is not in range %d - 100!\n",start);
                number = -1;
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid Number!");
            //throw e;
        }
        return number;
    }
}