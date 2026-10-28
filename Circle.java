// Student name and ID: TODO (provide the official details before submission)

import java.awt.geom.Ellipse2D;

/** A circle whose dimensions and results use the float values in the lab UML. */
public class Circle extends Shape {
    private float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public void readShape() {
        radius = readDimension("Please input the radius:");
    }

    public void computeArea() {
        area = (float) Math.PI * radius * radius;
    }

    public void computePerimeter() {
        perimeter = 2 * (float) Math.PI * radius;
    }

    public void displayShape() {
        displayResults("circle");
    }

    /** Draw the circle in the upper-left area of the canvas. */
    public void draw() {
        double diameter = Math.min(2.0 * radius, 270.0);
        Canvas.getCanvas().draw(this, "blue", new Ellipse2D.Double(15, 15, diameter, diameter));
    }
}
