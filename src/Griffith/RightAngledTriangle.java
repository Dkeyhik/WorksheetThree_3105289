package Griffith;

public class RightAngledTriangle extends Shape {
    private double base;
    private double height;
    private double hypotenuse;

    public RightAngledTriangle(String name, double base, double height, double hypotenuse) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
        this.hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)); // Recalculate hypotenuse
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)); // Recalculate hypotenuse
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double area() {
        return (base * height) / 2; // (base * height) / 2
    }

    @Override
    public double perimeter() {
        return base + height + hypotenuse; // base + height + hypotenuse
    }

    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height + ", Hypotenuse: " + hypotenuse;
    }
}
