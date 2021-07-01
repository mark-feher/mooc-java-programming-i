
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers: ");

        Statistics st = new Statistics();
        Statistics stEven = new Statistics();
        Statistics stOdd = new Statistics();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Sum: " + st.sum());
                System.out.println("Sum of even numbers: " + stEven.sum());
                System.out.println("Sum of odd numbers: " + stOdd.sum());

                break;
            }
            st.addNumber(number);

            if (number % 2 == 0) {
                stEven.addNumber(number);
            } else if (number % 2 == 1 || number % 2 == -1) {
                stOdd.addNumber(number);
            }
        }
    }
}
