package Griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class ShapeTest {

    @Test
    void testCircle() {
        Circle circle = new Circle("MyCircle", 3.0);
        assertEquals(28.2743, circle.area(), 0.0001);  // π * r²
        assertEquals(18.8495, circle.perimeter(), 0.0001);  // 2 * π * r
    }

    @Test
    void testRhombus() {
        Rhombus rhombus = new Rhombus("MyRhombus", 4, 6, 5);
        assertEquals(12.0, rhombus.area(), 0.0001);  // (d1 * d2) / 2
        assertEquals(20.0, rhombus.perimeter(), 0.0001);  // 4 * side
    }

    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle triangle = new RightAngledTriangle("MyTriangle", 3, 4);
        assertEquals(6.0, triangle.area(), 0.0001);  // (base * height) / 2
        assertEquals(12.0, triangle.perimeter(), 0.0001);  // 3 + 4 + 5
    }

    @Test
    void testIntegration() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle1", 2));
        shapes.add(new Circle("Circle2", 3));
        shapes.add(new Rhombus("Rhombus1", 4, 6, 5));
        shapes.add(new Rhombus("Rhombus2", 5, 8, 6));
        shapes.add(new RightAngledTriangle("Triangle1", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle2", 5, 12));

        for (Shape shape : shapes) {
            assertTrue(shape.area() > 0);
            assertTrue(shape.perimeter() > 0);
        }
    }
}
