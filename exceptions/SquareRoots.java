package exceptions;

import java.util.Scanner;

public class SquareRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number<0){
                throw new ArithmeticException();
            }
            System.out.printf("%.2f\n", Math.sqrt(number));
        } catch (Exception e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
