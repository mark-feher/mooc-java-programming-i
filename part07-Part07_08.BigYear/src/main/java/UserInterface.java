import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Observation observation;

    public UserInterface(Scanner scanner, Observation observation) {
        this.scanner = scanner;
        this.observation = observation;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().toLowerCase();

            if (command.equals("quit")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String nameInLatin = scanner.nextLine();

                observation.addBird(name, nameInLatin);
            }
            if (command.equals("all")) {
                observation.listBirds();
            }
            if (command.equals("observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                observation.observe(name);
            }
            if (command.equals("one")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                observation.listOneBird(name);
            }
        }
    }
}
