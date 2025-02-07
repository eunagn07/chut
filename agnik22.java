public class PerimeterCalculator {

    // Circle class
    static class Circle {
        double radius;

        // Parameterized constructor
        Circle(double radius) {
            this.radius = radius;
        }

        // Method to calculate perimeter
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // Rectangle class
    static class Rectangle {
        double length, width;

        // Parameterized constructor
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Method to calculate perimeter
        double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    // Square class
    static class Square {
        double side;

        // Parameterized constructor
        Square(double side) {
            this.side = side;
        }

        // Method to calculate perimeter
        double calculatePerimeter() {
            return 4 * side;
        }
    }

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide dimensions as follows:");
            System.out.println("Circle Radius, Rectangle Length and Width, Square Side");
            return;
        }

        try {
            // Parse command-line arguments
            double radius = Double.parseDouble(args[0]);
            double rectLength = Double.parseDouble(args[1]);
            double rectWidth = Double.parseDouble(args[2]);
            double squareSide = Double.parseDouble(args[3]);

            // Create objects
            Circle circle = new Circle(radius);
            Rectangle rectangle = new Rectangle(rectLength, rectWidth);
            Square square = new Square(squareSide);

            // Calculate and display perimeters
            System.out.printf("Circle Perimeter: %.2f%n", circle.calculatePerimeter());
            System.out.printf("Rectangle Perimeter: %.2f%n", rectangle.calculatePerimeter());
            System.out.printf("Square Perimeter: %.2f%n", square.calculatePerimeter());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
