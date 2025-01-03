package work3;

/**
 * The Main class demonstrates the use of the Composite design pattern with
 * graphical objects. It creates individual primitives and composites, adds
 * them to a composite structure, and calls the draw() method to display
 * the attributes of each object.
 */
public class Main {

    /**
     * The entry point of the application. Demonstrates how to create and
     * manage graphical primitives and composites, showing the flexibility
     * of the Composite design pattern.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create individual points (graphical primitives)
        Point point1 = new Point(10, 20, 5, 5);
        Point point2 = new Point(15, 25, 10, 10);
        Point point3 = new Point(20, 30, 15, 15);

        // Create a composite graphic and add points to it
        CompositeGraphic composite1 = new CompositeGraphic();
        composite1.add(point1);
        composite1.add(point2);

        // Create another composite graphic
        CompositeGraphic composite2 = new CompositeGraphic();
        composite2.add(point3);

        // Create a main composite and add the previous composites
        CompositeGraphic mainComposite = new CompositeGraphic();
        mainComposite.add(composite1);
        mainComposite.add(composite2);

        // Display all graphical objects in the main composite
        System.out.println("Displaying main composite structure:");
        mainComposite.draw();
    }
}
