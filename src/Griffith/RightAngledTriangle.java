package Griffith;

public class RightAngledTriangle extends Shape {
    private double base, height, hypotenuse;

    public RightAngledTriangle(String name, double base, double height, double hypotenuse) {
        super(name);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height + ", Hypotenuse: " + hypotenuse;
    }

    @Override
    public double area() { return 0; }  // Stub
    @Override
    public double perimeter() { return 0; }  // Stub
}
