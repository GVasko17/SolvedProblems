package MethodsExercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int result = sumOfFirstTwoIntegers(num1, num2) - num3;
        System.out.println(result);
    }
    public static int sumOfFirstTwoIntegers(int num1, int num2){
        return num1 + num2;
    }

}
