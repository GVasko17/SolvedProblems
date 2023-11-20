package shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle(5.5);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4.5, 6.5);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

    }
}
