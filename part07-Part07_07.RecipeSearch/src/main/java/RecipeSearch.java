
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CookingBook cookingBook = new CookingBook();
        UserInterface ui = new UserInterface(scanner, cookingBook);

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner recipeScanner = new Scanner(Paths.get(fileName))) {
            ArrayList<String> fileLines = new ArrayList<>();

            while (recipeScanner.hasNextLine()) {

                String line = recipeScanner.nextLine();

                if (line.trim().isEmpty() || !recipeScanner.hasNextLine()) {
                    // when the line is empty or the scanner doesn't have more lines to read
                    // assign lines to ArrayList

                    String recipeName = fileLines.get(0);
                    int cookingTime = Integer.parseInt(fileLines.get(1));
                    ArrayList<String> ingredients = new ArrayList<>();

                    for (int i = 2; i < fileLines.size(); i++) {
                        ingredients.add(fileLines.get(i));
                    }

                    cookingBook.addRecipe(new Recipe(recipeName, cookingTime, ingredients));

                    fileLines.removeAll(fileLines);
                } else {
                    fileLines.add(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        ui.start();


    }

}
