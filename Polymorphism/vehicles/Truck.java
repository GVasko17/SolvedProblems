package vehicles;

public  class Truck extends AbstractVehicle {
    private static final double SUMMER_FUEL_CONSUMPTION = 1.6;
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
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
        super.refuel(litres * 0.95);
    }
}
