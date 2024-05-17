import static org.junit.Assert.*;
import org.junit.Test;

public class IngredientTest {

    @Test
    public void testIngredientConstructorAndGetters() {
        Ingredient ingredient = new Ingredient("Flour", 500, "grams");
        assertEquals("Flour", ingredient.getName());
        assertEquals(500, ingredient.getQuantity(), 0.0);
        assertEquals("grams", ingredient.getUnit());
    }

    @Test
    public void testSettersAndNutrition() {
        Ingredient ingredient = new Ingredient("Sugar", 300, "grams");
        ingredient.setQuantity(400);
        assertEquals(400, ingredient.getQuantity(), 0.0);
       
        Nutrition nutrition = new Nutrition(0, 0, 0, 0, 0);
        ingredient.setNutritionalTarget(nutrition);
        assertNotNull(ingredient.getNutritionalTarget());
    }
}