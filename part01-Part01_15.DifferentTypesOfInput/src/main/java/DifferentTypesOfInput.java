
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String strValue = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleValue = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanValue = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + strValue);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + booleanValue);

    }
}
