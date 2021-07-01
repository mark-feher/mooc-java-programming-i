
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        System.out.println("Which file should have its contents printed?");
        Scanner scanner = new Scanner(System.in);

        String thisFile = scanner.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(thisFile))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
