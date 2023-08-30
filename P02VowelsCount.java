package MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        printingVowels(textInput);
    }
    public static void printingVowels(String text){
        int countVowels = 0;
        for (char symbol: text.toLowerCase().toCharArray()) {
            if (symbol == 'a' || symbol == 'u' || symbol == 'o' || symbol == 'i' || symbol == 'e'){
                countVowels++;
            }
        }
        System.out.println(countVowels);

    }
}
