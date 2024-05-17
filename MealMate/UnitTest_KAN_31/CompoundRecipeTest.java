package MealTracker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CompoundRecipeTest {

	@Test
	public void testCompoundRecipe() {
		Ingredient i1 = new Ingredient("test1", "unit1", new Nutrition(1.0, 2.0, 3.0, 4.0, 5.0), 6.0);
		Ingredient i2 = new Ingredient("test2", "unit2", new Nutrition(1.0, 2.0, 3.0, 4.0, 5.0), 6.0);
		Ingredient i3 = new Ingredient("test3", "unit3", new Nutrition(1.0, 2.0, 3.0, 4.0, 5.0), 6.0);
		RecipeIngredient ri1 = new RecipeIngredient(i1, 1.0); //6
		RecipeIngredient ri2 = new RecipeIngredient(i2, 2.0); //12
		RecipeIngredient ri3 = new RecipeIngredient(i3, 3.0); //18
		ArrayList<Food> recipelist1 = new ArrayList<Food>();
		recipelist1.add(ri1);
		recipelist1.add(ri2);
		Recipe recipe1= new Recipe(recipelist1, 1);
		ArrayList<Food> recipelist2 = new ArrayList<Food>();
		recipelist2.add(ri3);
		recipelist2.add(recipe1);
		Recipe recipe2= new Recipe(recipelist2, 1);
		
		assertEquals(36.0, recipe2.getPrice()); //36
		assertEquals(6.0,recipe2.getNutrition().getCalorieArray()[0]); // 6
		assertEquals(3, recipe2.getRecipeIngredients().size()); //3
		
		

	}
	

}
