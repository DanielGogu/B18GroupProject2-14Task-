package Task11;

public class CircleSquareTest {
    public static void main(String[] args) {
        System.out.println("Task 11 being tested...");
        Circle c=new Circle(15.0);
        System.out.println("The area of a circle is "+c.calculateArea());
        System.out.println("The perimeter of a circle is "+c.calculatePerimeter());
        System.out.println("*********");
        Square sq=new Square(23.5);
        System.out.println("The area of a square is "+sq.calculateArea());
        System.out.println("The perimeter of a square is "+sq.calculatePerimeter());
    }
}
