package polymorphism.wildFarm;

public abstract class Food {
    private final Integer quantity;

   protected Food(Integer quantity) {
        this.quantity = quantity;
    }

    protected Integer getQuantity() {
        return quantity;
    }
}
