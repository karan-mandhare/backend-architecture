package java_prct;
import java.lang.Math;

abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method — no implementation, subclass MUST implement
    public abstract double area();

    // Concrete method — shared by all shapes
    public String getColor() {
        return color;
    }

    public String describe() {
        return "A " + color + " shape with area " + area();
    }
}

class Circle extends Shape{
    public final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
       return Math.PI * radius * radius;
    }
    
}

class Rectangle extends Shape{
    public final double width;
    public final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class AbstractClassExmp {
    public static void main(String[] args) {
        Shape circle = new Circle("red", 5);
        Shape rectangle = new Rectangle("blue", 4, 6);

        System.out.println(circle.describe());
        System.out.println(rectangle.describe());
    }
}
