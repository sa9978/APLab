import java.util.ArrayList;

public class Paint {
    ArrayList<Shape> shapes = new ArrayList<>();

    /**
     * @param shape is the shape that is adding list
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * draw all the shapes
     */
    public void drawAll() {
        System.out.println("\ndraw all : ");
        int i = 1;
        for (Shape temp : shapes) {
            System.out.println(i + " )");
            temp.draw();
            System.out.println();
            i++;
        }
        System.out.println();
    }

    /**
     * print all the shapes
     */
    public void printAll() {
        System.out.println("\nprint all : ");
        int i = 1;
        for (Shape temp : shapes) {
            System.out.println(i + " )");
            System.out.println(temp);
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public void describeEqualSides(Shape shape) {
        if (shape instanceof Triangle) {
            if (((Triangle) shape).isEquilateral()) {
                System.out.println("its a Equilateral Triangle!");
            } else {
                System.out.println("its NOT a Equilateral Triangle!");
            }
        } else if (shape instanceof Rectangle) {
            if (((Rectangle) shape).isSquare()) {
                System.out.println("its a Sqaure!");
            } else {
                System.out.println("its NOT a Sqaure!");
            }
        }
    }
}
