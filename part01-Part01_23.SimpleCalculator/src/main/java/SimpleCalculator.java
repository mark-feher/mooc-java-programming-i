
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int resultAdd = first + second;
        int resultSubtract = first - second;
        int resultMultiply = first * second;
        double resultDivide = (double)first / second;
        System.out.println(first + " + " + second + " = " + resultAdd);
        System.out.println(first + " - " + second + " = " + resultSubtract);
        System.out.println(first + " * " + second + " = " + resultMultiply);
        System.out.println(first + " / " + second + " = " + resultDivide);
    }
}
