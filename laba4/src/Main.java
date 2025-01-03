package work4;
/**
 * The Main class for testing the operation of graphic objects and compositions.
 * Demonstrates the creation of points and their composition using Composite.
 */
public class Main {
    /**
     * The main method to run the program.
     */
    public static void main(String[] args) {
        // Створення точок
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);

        // Створення композиції
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(point1);
        composite.add(point2);

        // Виклик методу draw
        composite.draw();
    }
}