package vehicles;

public class Bus extends AbstractVehicle {

    private static final double FUEL_CONSUMPTION_WITH_AC = 1.4;
    private static final boolean DEFAULT_IS_DRIVE_EMPTY = true;
    private boolean isEmpty;


    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public boolean isEmpty() {
        return isEmpty;
    }
    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
    public void turnOnOfAc(boolean isEmpty) {
        if (isEmpty) {
            super.setFuelConsumption(getFuelConsumption());
        } else {
            super.setFuelConsumption(getFuelConsumption() + FUEL_CONSUMPTION_WITH_AC);
        }
    }

    @Override
    public String drive(double distance) {
        return super.drive(distance);
    }
}
