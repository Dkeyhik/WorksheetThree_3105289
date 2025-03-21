package Griffith;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2); // π * r²
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // 2 * π * r
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}
