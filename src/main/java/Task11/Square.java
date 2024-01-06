package Task11;

public class Square implements Shape {

    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
