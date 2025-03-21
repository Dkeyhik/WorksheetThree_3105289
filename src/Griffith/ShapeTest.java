package Griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class ShapeTest {
    private static final double EPSILON = 0.001;

    @Test
    public void testCircle() {
        Circle c = new Circle("Circle", 3);
        assertEquals(28.274, c.area(), EPSILON);
        assertEquals(18.849, c.perimeter(), EPSILON);
        assertEquals("Shape: Circle, Radius: 3.0", c.toString());
    }

    @Test
    public void testRhombus() {
        Rhombus r = new Rhombus("Rhombus", 4, 5, 3);
        assertEquals(10, r.area(), EPSILON);
        assertEquals(12, r.perimeter(), EPSILON);
        assertEquals("Shape: Rhombus, Diagonals: 4.0 & 5.0, Side: 3.0", r.toString());
    }

    @Test
    public void testRightAngledTriangle() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4, 5);
        assertEquals(6, t.area(), EPSILON);
        assertEquals(12, t.perimeter(), EPSILON);
        assertEquals("Shape: Triangle, Base: 3.0, Height: 4.0, Hypotenuse: 5.0", t.toString());
    }
    
    @Test
    public void integrationTest() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle1", 2));
        shapes.add(new Circle("Circle2", 3));
        shapes.add(new Rhombus("Rhombus1", 4, 5, 3));
        shapes.add(new Rhombus("Rhombus2", 6, 7, 5));
        shapes.add(new RightAngledTriangle("Triangle1", 3, 4, 5));
        shapes.add(new RightAngledTriangle("Triangle2", 5, 12, 13));

        for (Shape s : shapes) {
            assertTrue(s.area() > 0);
            assertTrue(s.perimeter() > 0);
        }
    }

    
}
