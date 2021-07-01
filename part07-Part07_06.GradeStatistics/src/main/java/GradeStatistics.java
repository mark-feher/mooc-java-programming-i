import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> pointsList;

    public GradeStatistics() {
        this.pointsList = new ArrayList<>();
    }

    public void addPoints(int pointsToAdd) {
        if (pointsToAdd >= 0 && pointsToAdd <= 100) {
            this.pointsList.add(pointsToAdd);
        } else return;
    }



    public String averageTotal() {
        int sum = 0;
        double result = 0;

        for (Integer points: pointsList) {
            sum += points;
        }

        result = (double) sum / this.pointsList.size();

        if (result >= 0) {
            return "Point average (all): " + result;
        }

        return "Point average (all): -";
    }

    public String averagePassing() {
        int count = 0;
        int sum = 0;
        double result = 0;

        for (Integer points: pointsList) {
            if (points >= 50) {
                count++;
                sum += points;
            }
        }

        result = (double) sum / count;

        if (result >= 0) {
            return "Point average (passing): " + result;
        }

        return "Point average (passing): -";
    }

    public String passPercentage() {
        double result = 0;
        int passing = 0;

        for (Integer points: pointsList) {
            if (points >= 50) {
                passing++;
            }
        }

        result = (double) 100 * passing / this.pointsList.size();

        if (result >= 0) {
            return "Pass percentage: " + result;
        }
        return "Pass percentage: -";
    }

    public void gradeDistribution() {
        int[] grades = new int[6];

        for (Integer points: pointsList) {
            if (points < 50) {
                grades[0]++;
            }  else if (points < 60) {
                grades[1]++;
            } else if (points < 70) {
                grades[2]++;
            } else if (points < 80) {
                grades[3]++;
            } else if (points < 90) {
                grades[4]++;
            } else grades[5]++;
        }

        System.out.println("Grade distribution: ");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");

            for (int j = grades[i]; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
