package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SoftuniUserException {
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("softuni")) {
            throw new SoftuniUserException("invalid");
        }
    }
}
