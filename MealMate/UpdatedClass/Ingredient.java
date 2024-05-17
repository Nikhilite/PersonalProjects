//updated

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    private String name;
    private float quantity;
    private String unit;
    private Nutrition nutritionalTarget; 

    public Ingredient(String name, float quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setNutritionalTarget(Nutrition nutritionalTarget) {
        this.nutritionalTarget = nutritionalTarget;
    }

    public Nutrition getNutritionalTarget() {
        return nutritionalTarget;
    }
}