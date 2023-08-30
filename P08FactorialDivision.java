package MethodsExercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 =Integer.parseInt(scanner.nextLine());
        int number2 =Integer.parseInt(scanner.nextLine());

        long fact1 = factorialCalculating(number1);
        long fact2 = factorialCalculating(number2);

        double division = fact1 * 1.0 / fact2;

        System.out.printf("%.2f", division);
    }
    public static long factorialCalculating (int num){
        long fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
