public abstract class Shape {
/**
 * @author sara
 * @version 1.0.0
 * Shape is a Super, Abstract Class for other Shapes!
 */

    /**
     * @return Perimeter of the Shape
     */
    public abstract double calculatePerimeter();

    /**
     * @return Area of the Shape
     */
    public abstract double calculateArea();

    /**
     * show the Shape's name , and its Area and perimeter
     */
    public abstract void draw();

    /**
     * @param o is the object should be checked
     * @return a boolean
     */
    @Override
    public abstract boolean equals(Object o);

    /**
     * @return a String
     */
    @Override
    public abstract String toString();

}
