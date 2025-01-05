package workingWithAbstraction.cardsThree;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandRank = scanner.nextLine();
        CardRank rank = CardRank.valueOf(commandRank);
        String commandSuite = scanner.nextLine();
        CardSuite suite = CardSuite.valueOf(commandSuite);
        Card card = new Card(rank.getPower() + suite.getPower());


        System.out.printf("Card name: %s of %s; Card power: %s", CardRank.valueOf(commandRank), CardSuite.valueOf(commandSuite),card.getCardPower() );
    }
}
