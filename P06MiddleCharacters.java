package MethodsExercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleSymbol(text);

    }
    public static void printMiddleSymbol (String text){
    if (text.length() % 2 != 0){
        int middleIndex = text.length() / 2;
        System.out.println(text.charAt(middleIndex));
    }
    else {
        int firstMiddleIndex = text.length() / 2 - 1;
        int secondMiddleIndex = text.length() / 2;
        System.out.print(text.charAt(firstMiddleIndex));
        System.out.print(text.charAt(secondMiddleIndex));
    }

    }
}
