package NextPage;

public class ShapeTester {
        public static void main(String[] args) {
            // Create instances of Circle and Square
            Circle circle = new Circle(5.0);
            Square square = new Square(4.0);

            // Test the calculateArea and calculatePerimeter methods
            System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
            System.out.println("Square - Area: " + square.calculateArea() + ", Perimeter: " + square.calculatePerimeter());
        }
    }


