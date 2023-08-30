package MethodsExercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n ; number++) {
            if (ifSumOfDigitsDivisionOf8(number) && ifHoldsOneOddDigit(number)){
                System.out.println(number);
            }
        }
    }
    public static boolean ifSumOfDigitsDivisionOf8 (int num){
        int sum = 0;
        while (num > 0){
            for (int i = 1; i <= num ; i++) {
                int lastDigit = num % 10;
                sum += lastDigit;
                num /= 10;
            }
        }
        return sum % 8 == 0;
    }
    public static boolean ifHoldsOneOddDigit(int num){
        while (num > 0){
           int lastDigit = num % 10;
            if (lastDigit % 2 != 0){
                return true;
            }
            else {
                num = num / 10;
            }
        }
        return false;
    }
}
