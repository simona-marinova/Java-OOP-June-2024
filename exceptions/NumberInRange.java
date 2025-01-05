package exceptions;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] range = scanner.nextLine().split(" ");
        int startNumber = Integer.parseInt(range[0]);
        int endNumber = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]\n", startNumber, endNumber);

        while(true) {
            String number = scanner.nextLine();
            try {
                int numberToInt = Integer.parseInt(number);
                if(numberToInt>=startNumber && numberToInt<=endNumber){
                    System.out.printf("Valid number: %d\n", numberToInt);
                    break;
                }
                else {
                    System.out.printf("Invalid number: %d\n", numberToInt);
                }
            }
            catch (Exception e) {
                System.out.printf("Invalid number: %s\n", number);
            }
        }

    }

}
