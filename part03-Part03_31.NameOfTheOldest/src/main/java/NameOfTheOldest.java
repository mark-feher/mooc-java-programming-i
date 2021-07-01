
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String nameOldest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int helper = Integer.parseInt(parts[1]);
            if (helper > oldest) {
                oldest = helper;
                nameOldest = parts[0];
            }
        }
        //System.out.println("The oldest person: " + oldest);
        System.out.println("Name of the oldest: " + nameOldest);

    }
}
