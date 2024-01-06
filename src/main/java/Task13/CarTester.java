package Task13;

public class CarTester {
    public static void main(String[] args) {

        Car sedan = new Sedan(25300.2F, "White", 21.5F);
        Car truck = new Truck(42333.4F, "Black", 3124.8F);
        Car[] cars = {sedan, truck};
        for (Car car : cars) {
            System.out.println("The price of the car is "+car.calculateSalePrice());
        }
    }

}
