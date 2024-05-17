import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


public class FoodTest {

    @Test
    public void testFoodConstructorAndGetters() {
        Food food = new Food("Apple", 1.0, 0.50);
        assertEquals("Apple", food.getName());
        assertEquals(1.0, food.getQuantity(), 0.0);
        assertEquals(0.50, food.getCost(), 0.0);
    }
}

}
