package MethodsExercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")){
            if (ifIsPalindrome(command)){
                System.out.println("true");
            }else {
                System.out.println("false");

            }
            command = scanner.nextLine();
        }

    }
    public static boolean ifIsPalindrome(String text){
        String reversedText = "";
        for (int index = text.length() - 1; index >= 0 ; index--) {
            reversedText += text.charAt(index);
        }
        return text.equals(reversedText);
    }
}
