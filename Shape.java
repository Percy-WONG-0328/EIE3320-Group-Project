// Student name and ID: TODO (provide the official details before submission)

import java.util.NoSuchElementException;
import java.util.Scanner;

/** Shared calculations and input behavior for the three geometric shapes. */
public abstract class Shape implements Drawable {
    protected float area;
    protected float perimeter;

    // One scanner is shared with ShapeTester so input is consumed in order.
    protected static final Scanner INPUT = new Scanner(System.in);

    public abstract void readShape();
    public abstract void computeArea();
    public abstract void computePerimeter();
    public abstract void displayShape();

    /** Keep asking until a finite, positive decimal dimension is entered. */
    protected static float readDimension(String prompt) {
        while (true) {
            System.out.println(prompt);
            if (!INPUT.hasNextLine()) {
                throw new NoSuchElementException("Input ended while reading a dimension");
            }
            String text = INPUT.nextLine().trim();
            try {
                float value = Float.parseFloat(text);
                if (Float.isFinite(value) && value > 0) {
                    return value;
                }
            } catch (NumberFormatException ignored) {
                // The message below also covers non-numeric input.
            }
            System.out.println("Please enter a positive number.");
        }
    }

    /** Print results in the order and wording used by the lab examples. */
    protected void displayResults(String type) {
        System.out.println("Area of " + type + " = " + area);
        System.out.println("Perimeter of " + type + " = " + perimeter);
    }
}
