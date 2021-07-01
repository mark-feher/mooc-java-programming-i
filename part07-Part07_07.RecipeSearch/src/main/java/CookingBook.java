import java.util.ArrayList;
import java.util.Locale;

public class CookingBook {
    private ArrayList<Recipe> recipes;

    public CookingBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printRecipeBook() {
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }

    public void searchRecipeByName(String findRecipe) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe recipe: recipes) {
                if (recipe.getRecipeName().contains(findRecipe.toLowerCase())) {
                    System.out.println(recipe);
                }
            }
        }
    }

    public void searchRecipeByCookingTime(int cookingTime) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe recipe: recipes) {
                if (recipe.getCookingTime() <= cookingTime) {
                    System.out.println(recipe);
                }
            }
        }
    }

    public void searchRecipeByIngredients(String ingredient) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe recipe: recipes) {
                if (recipe.getIngredients().contains(ingredient.toLowerCase())) {
                    System.out.println(recipe);
                }
            }
        }
    }

}
