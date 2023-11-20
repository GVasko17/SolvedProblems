package wildFarm;

public abstract class Mammal extends Animal {

    public Mammal(String name, String animalType, Double animalWeight, String livingRegion) {
        super(name, animalType, animalWeight, livingRegion);

    }

    @Override
    public boolean canEat(Food food) {
        return food.getClass().getSimpleName().equals("Vegetable");
    }


}
