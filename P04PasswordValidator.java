package MethodsExercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isValidLength = ifPasswordLengthIsValid(password);

        if (!isValidLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean consistsLetterAndDigits = ifPassConsistsLettersAndDigits(password);

        if (!consistsLetterAndDigits) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean have2Digits = ifPassHave2Digits(password);

        if (!have2Digits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && consistsLetterAndDigits && have2Digits){
            System.out.println("Password is valid");
        }

    }
    public static boolean ifPasswordLengthIsValid (String password){
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        }else {
            return false;
        }
    }
    public static boolean ifPassConsistsLettersAndDigits (String password){
        for (char symbol: password.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    public static boolean ifPassHave2Digits (String password){
        int count = 0;
        for (char symbol: password.toCharArray()) {
            if (Character.isDigit(symbol)){
                count++;
            }
        }
        return count >= 2;
    }
}
