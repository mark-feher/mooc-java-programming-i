
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int whereTo = Integer.valueOf(scanner.nextLine());
        System.out.println("where from?");
        int whereFrom = Integer.valueOf(scanner.nextLine());
        for (int i = whereFrom; i <= whereTo; i++) {
            if (whereFrom > whereTo) {
                break;
            }
            System.out.println(i);
        }
    }
}
