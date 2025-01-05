package workingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n*2-1 ; i++) {
            if(i%2==(n*2-1)/2 +1){
                break;
            }
        }


    }
}
