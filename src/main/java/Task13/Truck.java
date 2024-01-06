package Task13;

public class Truck extends Car {
    float weight;
    public Truck(float carPrice, String color, float weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public float calculateSalePrice() {
        if (weight > 2000) {
            return (carPrice - (carPrice * 0.1F));
        } else {
            return (carPrice - (carPrice * 0.2F));
        }
    }
}
