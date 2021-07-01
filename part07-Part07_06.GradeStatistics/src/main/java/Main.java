
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics gradeStatistics = new GradeStatistics();
        UserInterface ui = new UserInterface(scanner, gradeStatistics);

//        gradeStatistics.addPoints(50);
//        System.out.println(gradeStatistics.printPoints());
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        ui.start();
    }
}
