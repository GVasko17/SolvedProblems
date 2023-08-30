package MethodsExercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printingCharacters(firstSymbol, secondSymbol);

    }
    public static void printingCharacters (char firstSym, char secondSym){
        int firstSymbol = (int) firstSym;
        int secondSymbol = (int) secondSym;
        for (int i = firstSymbol + 1; i < secondSymbol ; i++) {
            System.out.print((char) i + " ");
        }

    }
}
