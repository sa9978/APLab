import java.util.ArrayList;
import java.util.Objects;

/**
 * @author sara
 * @version 1.0.0
 * Polygon is a SubClass for Shape class that contains Polygons!
 */
public abstract class Polygon extends Shape {
    ArrayList<Integer> sides = new ArrayList<>();

    /**
     * a constructor for make sides ArrayList
     */
    public Polygon(int... sides) {
        super();
        for (int side : sides)
            this.sides.add(side);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    public abstract double calculatePerimeter();

    @Override
    public abstract double calculateArea();

    @Override
    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return Objects.equals(sides, polygon.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public abstract String toString();
}