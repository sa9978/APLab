/**
 * @author sara
 * @version 1.0.0
 * Rectangle is a SubClass for Polygon
 */
public class Rectangle extends Polygon {


    /**
     * @param a the first side of rectangle
     * @param b the second side of rectangle
     * @param c the third side of rectangle
     * @param d the fourth side of rectangle
     */
    public Rectangle(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public boolean isSquare() {
        if ((getSides().get(0) == getSides().get(1)) &&
                (getSides().get(1) == getSides().get(2)) &&
                (getSides().get(2) == getSides().get(3)))
            return true;
        return false;
    }

    @Override
    public double calculatePerimeter() {
        return getSides().get(0) + getSides().get(1) + getSides().get(2) + getSides().get(3);
    }

    @Override
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle | " +
                "Area : " + calculateArea() + " | " +
                "Perimeter :" + calculatePerimeter() + " | ");
    }

    @Override
    public String toString() {
        String st = "this is a rectangle\n";
        if (isSquare()) {
            st = st + "its sides are " + getSides().get(0);
        } else {
            st = st + "its different sides are : \n" + getSides().get(0) + " & " + getSides().get(1);
        }
        return st;
    }
}
