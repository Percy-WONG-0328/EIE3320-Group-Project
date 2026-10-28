// Student name and ID: TODO (provide the official details before submission)

import java.util.NoSuchElementException;

/** Menu for entering, calculating, displaying, and drawing shapes. */
public class ShapeTester {
    private static void printMenu() {
        System.out.println("*************************************");
        System.out.println("* Please choose one the followings:  *");
        System.out.println("* Press 'c' - Circle               *");
        System.out.println("* Press 's' - Square               *");
        System.out.println("* Press 'r' - Rectangle            *");
        System.out.println("* Press 'x' - EXIT                 *");
        System.out.println("*************************************");
    }

    public static void main(String[] args) {
        printMenu();
        while (Shape.INPUT.hasNextLine()) {
            String choice = Shape.INPUT.nextLine().trim();
            if (choice.equals("x")) {
                break;
            }

            Shape shape;
            switch (choice) {
                case "c": shape = new Circle(); break;
                case "s": shape = new Square(); break;
                case "r": shape = new Rectangle(); break;
                default:
                    System.out.println("Invalid choice. Please choose c, s, r, or x.");
                    printMenu();
                    continue;
            }

            try {
                shape.readShape();
            } catch (NoSuchElementException ended) {
                break;
            }
            shape.computeArea();
            shape.computePerimeter();
            shape.displayShape();
            shape.draw();
            printMenu();
        }
        Canvas.closeCanvas();
    }
}
