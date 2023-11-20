package vehicles;

import java.text.DecimalFormat;

public abstract class AbstractVehicle implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private DecimalFormat dc;
    private double tankCapacity;

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public AbstractVehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.dc = new DecimalFormat("#.##");
        this.tankCapacity = tankCapacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String drive(double distance) {
        double neededFuel = this.fuelConsumption * distance;

        if (neededFuel <= this.fuelQuantity) {
            this.fuelQuantity -= neededFuel;
            return String.format("%s travelled %s km",
                    this.getClass().getSimpleName(),
                    dc.format(distance));
        }
        return String.format("%s needs refueling",
                this.getClass().getSimpleName());
    }

    @Override
    public void refuel(double litres) {
        if (litres <= 0 ) {
            System.out.println("Fuel must be a positive number");
        } else if (fuelQuantity + litres > tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            this.fuelQuantity += litres;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
