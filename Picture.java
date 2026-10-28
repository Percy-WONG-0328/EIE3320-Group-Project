// Student name and ID: TODO (provide the official details before submission)

import java.util.ArrayList;

/** A collection that computes and displays different Shape subclasses. */
public class Picture {
    private final ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    /** Update both saved results for every shape in insertion order. */
    public void computeShape() {
        for (Shape shape : shapes) {
            shape.computeArea();
            shape.computePerimeter();
        }
    }

    public void listAllShapeTypes() {
        for (Shape shape : shapes) {
            shape.displayShape();
        }
    }

    /** Show only objects whose concrete class has the requested simple name. */
    public void listSingleShapeType(String className) {
        for (Shape shape : shapes) {
            if (shape.getClass().getSimpleName().equals(className)) {
                shape.displayShape();
            }
        }
    }
}
