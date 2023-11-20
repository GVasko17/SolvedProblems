package pizzaCalories;

import java.util.Map;

public class Topping {

    private static final Map<String, Double> TOPPINGSMAP =
            Map.of("Meat", 1.2,
                    "Veggies", 0.8,
                    "Cheese", 1.1,
                    "Sauce", 0.9
            );
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight <= 0 || weight > 50) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        if (!TOPPINGSMAP.containsKey(toppingType)) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    public double calculateCalories() {
        return 2 * weight * TOPPINGSMAP.get(toppingType);
    }
}
