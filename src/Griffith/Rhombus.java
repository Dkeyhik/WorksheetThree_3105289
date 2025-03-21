package Griffith;

public class Rhombus extends Shape {
    private double diagonal1, diagonal2, side;

    public Rhombus(String name, double diagonal1, double diagonal2, double side) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() + ", Diagonals: " + diagonal1 + " & " + diagonal2 + ", Side: " + side;
    }

    @Override
    public double area() { return 0; }  // Stub
    @Override
    public double perimeter() { return 0; }  // Stub
}
