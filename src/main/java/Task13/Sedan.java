package Task13;

public class Sedan extends Car {
    float length;
    public Sedan(float carPrice, String color, float length) {
        super(carPrice, color);
        this.length = length;
    }
    @Override
    float calculateSalePrice() {
        if (length > 20) {
            return (carPrice - carPrice * 0.05F);
        } else {
            return (carPrice - carPrice * 0.1F);
        }
    }
}
