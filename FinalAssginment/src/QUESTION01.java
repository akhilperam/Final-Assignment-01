/*
 * 1. Write a Java program that uses polymorphism by defining an interface called Shape
      with methods to calculate the area and perimeter of a shape. Then create classes
      that implement the Shape interface for different types of shapes, such as circles and
      triangles.
 * 
 */
// Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

// Main class
public class QUESTION01 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}