// Student name and ID: TODO (provide the official details before submission)

import java.awt.geom.Rectangle2D;

/** A rectangle with independent length and width. */
public class Rectangle extends Shape {
    private float length;
    private float width;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public void readShape() {
        length = readDimension("Please input the length:");
        width = readDimension("Please input the width:");
    }

    public void computeArea() {
        area = length * width;
    }

    public void computePerimeter() {
        perimeter = 2 * (length + width);
    }

    public void displayShape() {
        displayResults("rectangle");
    }

    /** Draw a horizontal example rectangle below the circle and square. */
    public void draw() {
        // Display scaling follows the wide rectangle in the lab screenshot.
        // The dimensions used for area and perimeter remain unchanged.
        double displayLength = Math.min(5.0 * length, 270.0);
        double displayWidth = Math.min(width, 70.0);
        Canvas.getCanvas().draw(this, "blue",
                new Rectangle2D.Double(15, 215, displayLength, displayWidth));
    }
}
