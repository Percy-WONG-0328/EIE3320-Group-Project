// Student name and ID: TODO (provide the official details before submission)

import java.awt.geom.Rectangle2D;

/** A square with a single side length. */
public class Square extends Shape {
    private float length;

    public Square() {
    }

    public Square(float length) {
        this.length = length;
    }

    public void readShape() {
        length = readDimension("Please input the length:");
    }

    public void computeArea() {
        area = length * length;
    }

    public void computePerimeter() {
        perimeter = 4 * length;
    }

    public void displayShape() {
        displayResults("square");
    }

    /** Draw a blue square near the middle of the canvas. */
    public void draw() {
        double side = Math.min(length, 180.0);
        Canvas.getCanvas().draw(this, "blue", new Rectangle2D.Double(105, 105, side, side));
    }
}
