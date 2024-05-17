import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RecipeTest {

    @Test
    public void testRecipePrice() {
        ArrayList<Food> ingredients = new ArrayList<>();
        ingredients.add(new Food("Tomato", 2, 0.75));
        ingredients.add(new Food("Cheese", 1, 2.50));
        Recipe recipe = new Recipe(ingredients, 1);
       
        assertEquals(3.25, recipe.getPrice(), 0.0);
    }
}

public class RecipeCostCalculatorTest {

    @Test
    public void testCalculateRecipeCost() {
        ArrayList<Food> ingredients = new ArrayList<>();
        ingredients.add(new Food("Onion", 1, 0.30));
        ingredients.add(new Food("Pepper", 1, 0.50));
       
        double cost = RecipeCostCalculator.calculateRecipeCost(ingredients);
        assertEquals(0.80, cost, 0.0);
    }
}
