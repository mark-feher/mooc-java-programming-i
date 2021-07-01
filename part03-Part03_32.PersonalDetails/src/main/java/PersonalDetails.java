
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int helperLength = 0;
        int nameLength;
        String helperName = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");

            // Longest name
            nameLength = pieces[0].length();
            if (helperLength < nameLength) {
                helperLength = nameLength;
                helperName = pieces[0];
            }

            // Sum: dates of birth
            sum+= Integer.parseInt(pieces[1]);
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Longest name:" + helperName);
        System.out.println("Average of the birth years: " + average);

    }
}
