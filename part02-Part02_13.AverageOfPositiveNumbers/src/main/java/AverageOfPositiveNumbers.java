
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0 && sum == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (number > 0) {
                sum = sum + number;
                count++;
            } else if (number < 0) {
                continue;
            } else {
                double average = (double) sum/count;
                System.out.println(average);
                break;
            }
        }

    }
}
