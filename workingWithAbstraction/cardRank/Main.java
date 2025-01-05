package workingWithAbstraction.cardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        CardRank [] ranks = CardRank.values();
        for (CardRank rank : ranks) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", rank.ordinal(),rank);
        }
    }
}
