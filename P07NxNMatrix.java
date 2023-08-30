package MethodsExercise;

import java.util.Iterator;
import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());

        printingNxN(num);
    }
    public static void printingNxN (int number){
        for (int index = 0; index < number; index++) {
            for (int i = 0; i < number; i++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
