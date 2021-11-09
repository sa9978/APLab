import java.util.Objects;

/**
 * @author sara
 * @version 1.0.0
 * Circle is a SubClass for Polygon class
 */
public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle | " +
                "Area : " + calculateArea() + " | " +
                "Perimeter :" + calculatePerimeter() + " | ");
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public String toString() {
        return "this is a circle\nand its radius is " + radius;
    }
}
