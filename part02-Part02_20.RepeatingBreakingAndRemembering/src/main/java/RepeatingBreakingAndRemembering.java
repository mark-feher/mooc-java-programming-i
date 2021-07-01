
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        double average = 0;
        int countEven = 0;
        int countOdd = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number != -1) {
                sum = sum + number;
                count++;
                if (number % 2 == 0) {
                    countEven++;
                } else if (number % 2 == 1 || number % 2 == -1) {
                    countOdd++;
                }
            } else {
                average = (double) sum / count;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even: " + countEven);
                System.out.println("Odd: " + countOdd);
                break;
            }
        }
    }
}
