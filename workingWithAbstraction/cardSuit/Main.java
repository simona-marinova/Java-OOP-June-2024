package workingWithAbstraction.cardSuit;

public class Main {
    public static void main(String[] args) {
        CardSuite[] array = CardSuite.values();
        //Ordinal value: 0; Name value: CLUBS

        System.out.println("Card Suits:");
        for (int i = 0; i < array.length ; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", i,array[i]);
        }

    }
}
