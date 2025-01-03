package work4;
/**
 * The GraphicObject interface defines a common method for all graphic objects.
 * Used in the Composite template to provide a single contract
 * between primitives and compositions of graphic elements.
 */
public interface GraphicObject {
    /**
     * A method for rendering a graphic object.
     * Each object that implements this interface must define its own method implementation.
     */
    void draw();
}

