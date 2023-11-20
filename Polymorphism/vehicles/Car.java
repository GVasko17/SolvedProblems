package vehicles;

public class Car extends AbstractVehicle {
    private static final double SUMMER_FUEL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + SUMMER_FUEL_CONSUMPTION, tankCapacity);
    }

    @Override
    public double getFuelQuantity() {
        return super.getFuelQuantity();
    }

    @Override
    public String drive(double distance) {
        return super.drive(distance);
    }

    @Override
    public void refuel(double litres) {
        super.refuel(litres);
    }
}
