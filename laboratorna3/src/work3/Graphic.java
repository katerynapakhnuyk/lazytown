package work3;

/**
 * The Graphic interface defines the structure for graphical objects
 * that can be displayed on a plane. This interface is intended to be
 * implemented by individual graphical primitives as well as composite
 * objects that group multiple primitives.
 */
public interface Graphic {

    /**
     * Draws the graphical object. This method should contain the logic
     * to display or represent the object on the screen or console.
     */
    void draw();

    /**
     * Returns the X coordinate of the object. The exact implementation
     * depends on the specific class (primitive or composite).
     *
     * @return the X coordinate
     */
    int getX();

    /**
     * Returns the Y coordinate of the object. The exact implementation
     * depends on the specific class (primitive or composite).
     *
     * @return the Y coordinate
     */
    int getY();

    /**
     * Returns the width of the object. This value represents the width
     * attribute for primitives and can be dynamically calculated for composites.
     *
     * @return the width of the object
     */
    int getWidth();

    /**
     * Returns the height of the object. This value represents the height
     * attribute for primitives and can be dynamically calculated for composites.
     *
     * @return the height of the object
     */
    int getHeight();
}
