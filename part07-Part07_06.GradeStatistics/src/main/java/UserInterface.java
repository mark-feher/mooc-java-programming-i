import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private  GradeStatistics gradeStatistics;

    public UserInterface(Scanner scanner, GradeStatistics gradeStatistics) {
        this.scanner = scanner;
        this.gradeStatistics = gradeStatistics;
    }

    public void start() {
        System.out.println("Enter points total, -1 stops: ");

        while (true) {
            int pointsToAdd = Integer.parseInt(scanner.nextLine());

            if (pointsToAdd == -1) {
                System.out.println("Ending program");
                System.out.println(gradeStatistics.averageTotal());
                System.out.println("Point average (passing): " + gradeStatistics.averagePassing());
                System.out.println("Pass percentage: " + gradeStatistics.passPercentage());
                gradeStatistics.gradeDistribution();
                break;
            } else gradeStatistics.addPoints(pointsToAdd);

        }
    }
}
