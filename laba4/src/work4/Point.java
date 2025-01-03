package work4;
/**
 * The Point class represents a graphic primitive — a point on a two-dimensional plane.
 * Implements the GraphicObject interface and provides its own implementation of the draw method.
 */
public class Point implements GraphicObject {
    private int x, y;


    /**
     * Constructor for creating a point with certain coordinates.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Displays information about the point coordinates on the screen.
     * This method represents a rendering of a point on the screen.
     */
    @Override
    public void draw() {
        // Заглушка методу
        System.out.println("Метод draw викликано для Point з параметрами: x=" + x + ", y=" + y);
    }
}


