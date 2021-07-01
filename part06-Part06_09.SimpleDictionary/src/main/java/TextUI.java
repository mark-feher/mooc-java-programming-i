import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String wordTranslation = scanner.nextLine();

                simpleDictionary.add(word, wordTranslation);
            }

            if (command.equals("search")) {
                System.out.println("To be translated: ");
                String searchWord = scanner.nextLine();

                if (simpleDictionary.translate(searchWord) == null) {
                    System.out.println("Word " + searchWord + " was not found");
                } else {
                    System.out.println(simpleDictionary.translate(searchWord));
                }


            }
        }





    }
}
