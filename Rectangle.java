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

    /** Draw a vertical rectangle in the lower-right of the canvas. */
    public void draw() {
        // Scale the vertical side for the 50-by-60 example in the lab figure.
        // Area and perimeter still use the dimensions entered by the user.
        double displayLength = Math.min(1.6 * length, 90.0);
        double displayWidth = Math.min(width, 85.0);
        Canvas.getCanvas().draw(this, "blue",
                new Rectangle2D.Double(205, 205, displayWidth, displayLength));
    }
}
