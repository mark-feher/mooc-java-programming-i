
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scanner.nextLine();

        System.out.println("Team: ");
        String teamName = scanner.nextLine().toLowerCase();

        int gameCounter = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] parts = line.split(",");

                if (parts.equals("")) {
                    continue;
                }

                String homeTeam = parts[0].trim();
                String visitingTeam = parts[1].trim();
                int homeTeamPoints = Integer.parseInt(parts[2].trim());
                int visitingTeamPoints = Integer.parseInt(parts[3].trim());

                if (teamName.equals(homeTeam.toLowerCase())) {
                    gameCounter++;
                    if (homeTeamPoints > visitingTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (teamName.equals(visitingTeam.toLowerCase())) {
                    gameCounter++;
                    if (visitingTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }

            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            e.getMessage();
        }


    }

}
