import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private CookingBook cookingBook;

    public UserInterface(Scanner scanner, CookingBook cookingBook) {
        this.scanner = scanner;
        this.cookingBook = cookingBook;
    }

    public void start() {

        boolean shouldLoop = true;

        System.out.println("Commands:" + "\n"
                + "list - list the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (shouldLoop) {
            System.out.print("Enter command: ");

            String command = scanner.nextLine();

            switch (command) {
                case "stop":

                    shouldLoop = false;
                    break;
                case "list":
                    System.out.println("Recipes:");
                    cookingBook.printRecipeBook();

                    break;
                case "find name":
                    System.out.print("Search word: ");
                    String searchWord = scanner.nextLine();

                    cookingBook.searchRecipeByName(searchWord);

                    break;
                case "find cooking time":
                    System.out.print("Search word: ");
                    searchWord = scanner.nextLine();

                    cookingBook.searchRecipeByCookingTime(Integer.parseInt(searchWord));

                    break;
                case "find ingredient":
                    System.out.print("Search word: ");
                    searchWord = scanner.nextLine();

                    cookingBook.searchRecipeByIngredients(searchWord);

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }
}
