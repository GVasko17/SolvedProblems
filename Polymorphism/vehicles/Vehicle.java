package vehicles;

public interface Vehicle {

    String drive(double distance);
    void refuel(double litres);

    default boolean isEmpty() {
        return true;
    }

    default void setEmpty(boolean empty) {

    }

    default void turnOnOfAc(boolean isEmpty) {

    }

}
