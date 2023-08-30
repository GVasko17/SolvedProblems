package MethodsExercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printingTheSmallestInteger(num1, num2, num3);
    }
    public static void printingTheSmallestInteger(int n1, int n2, int n3){
        if (n1 < n2 && n1 < n3){
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2);
        }else {
            System.out.println(n3);
        }
    }
}
