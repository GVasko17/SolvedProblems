package wildFarm;

public abstract class Food {
    Integer quantity = 0;

    protected Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
