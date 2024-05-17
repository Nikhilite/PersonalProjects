
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class NutritionTest {

    @Test
    public void testNutritionConstructorAndGetters() {
        double[] nutritionValues = {50.0, 20.0, 30.0, 10.0, 5.0};
        Nutrition nutrition = new Nutrition(nutritionValues);
        assertArrayEquals(nutritionValues, nutrition.getCalorieArray(), 0.0);
    }

    @Test
    public void testApplyQuantity() {
        Nutrition nutrition = new Nutrition(10, 5, 15, 0, 2);
        Nutrition adjustedNutrition = nutrition.applyQuantity(2);
       
        assertEquals(20, adjustedNutrition.getCalorieArray()[0], 0.0);
        assertEquals(10, adjustedNutrition.getCalorieArray()[1], 0.0);
    }

    @Test
    public void testCombineNutrition() {
        Nutrition nutritionA = new Nutrition(10, 5, 15, 0, 2);
        Nutrition nutritionB = new Nutrition(5, 10, 5, 0, 1);
        Nutrition combined = Nutrition.combineNutrition(nutritionA, nutritionB);
       
        assertEquals(15, combined.getCalorieArray()[0], 0.0);
        assertEquals(15, combined.getCalorieArray()[1], 0.0);
    }
}

