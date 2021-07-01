
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            } else {
                if (str.contains("av")) {
                    String[] avPieces = str.split(" ");

                    for (int i = 0; i < avPieces.length; i++) {
                        if (avPieces[i].contains("av")) {
                            System.out.println(avPieces[i]);
                        }
                    }
                }
            }
        }


    }
}
