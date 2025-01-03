package work3;

/**
 * The Point class represents a graphical primitive with positioning attributes
 * (coordinates on a plane) and dimensions (width and height).
 * This class implements the Graphic interface and can be used as an independent
 * graphical object or as part of a composite structure.
 */
public class Point implements Graphic {

    /** The X coordinate representing the object's position on the plane. */
    private int x;

    /** The Y coordinate representing the object's position on the plane. */
    private int y;

    /** The width of the object. */
    private int width;

    /** The height of the object. */
    private int height;

    /**
     * Constructs a Point object with the specified parameters.
     *
     * @param x the initial X coordinate
     * @param y the initial Y coordinate
     * @param width the width of the object
     * @param height the height of the object
     */
    public Point(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Displays the graphical object. Outputs information about the coordinates
     * and dimensions of this object to the console.
     */
    @Override
    public void draw() {
        System.out.println("Method draw with parameters x=" + x + ", y=" + y +
                ", width=" + width + ", height=" + height);
    }

    /**
     * Returns the X coordinate of the object.
     *
     * @return the X coordinate
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     * Returns the Y coordinate of the object.
     *
     * @return the Y coordinate
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     * Returns the width of the object.
     *
     * @return the width
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the object.
     *
     * @return the height
     */
    @Override
    public int getHeight() {
        return height;
    }
}
