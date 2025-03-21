package Griffith;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }

    @Override
    public double area() { return 0; }  // Stub
    @Override
    public double perimeter() { return 0; }  // Stub
}
