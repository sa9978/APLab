/**
 * @author sara
 * @version 1.0.0
 * triangle is a SubClass for Polygon class
 */

public class Triangle extends Polygon {
    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double calculatePerimeter() {
        return getSides().get(0) + getSides().get(1) + getSides().get(2);
    }

    @Override
    public double calculateArea() {
        double s = (getSides().get(0) + getSides().get(1) + getSides().get(2)) / (double) 2;
        double area = Math.sqrt(s * (s - getSides().get(0)) * (s - getSides().get(1)) * (s - getSides().get(2)));
        return area;
    }

    /**
     * @return a boolean to show if the rectangle is Equilateral or not
     */
    public boolean isEquilateral() {
        if ((getSides().get(0) == getSides().get(1)) && (getSides().get(1) == getSides().get(2)))
            return true;
        return false;
    }

    @Override

    public void draw() {
        if (isEquilateral())
            System.out.println("Equilateral | " +
                    "Area : " + calculateArea() + " | " +
                    "Perimeter :" + calculatePerimeter() + " | ");
        else {
            System.out.println("not a Equilateral | " +
                    "Area : " + calculateArea() + " | " +
                    "Perimeter :" + calculatePerimeter() + " | ");
        }

    }

    @Override
    public String toString() {
        return "this is a triangle\nits sides are : \n" + getSides().get(0) + " & " + getSides().get(1) + " & " + getSides().get(3);
    }
}
