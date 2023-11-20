package wildFarm;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;
    private String livingRegion;

    public Animal(String name, String animalType, Double animalWeight, String livingRegion) {
        this.animalName = name;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
        this.livingRegion = livingRegion;
    }

    public abstract boolean canEat(Food food);

    public void eat(Food food) {
        if (!canEat(food)) {
            throw new IllegalArgumentException(getClass().getSimpleName() + "s are not eating that type of food!");
        }
        foodEaten += food.getQuantity();
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",
                getClass().getSimpleName(),
                animalName,
                decimalFormat.format(animalWeight),
                livingRegion,
                foodEaten
        );
    }
}


