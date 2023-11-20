package wildFarm;

public class Tiger extends Feline {

    public Tiger(String name, String animalType, Double animalWeight, String livingRegion) {
        super(name, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }


    @Override
    public boolean canEat(Food food) {
        return food.getClass().getSimpleName().equals("Meat");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
