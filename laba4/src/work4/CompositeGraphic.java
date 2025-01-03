package work4;

import java.util.ArrayList;
import java.util.List;
/**
 * The CompositeGraphic class represents a composition of graphic objects.
 * Can contain both primitives and other compositions that allow you to create
 * recursive structure of objects. Implements the GraphicObject interface.
 */
public class CompositeGraphic implements GraphicObject {
    /**
     * List of child graphic objects.
     * Used to store all graphic objects,
     * which is part of this composition.
     */
    private List<GraphicObject> children = new ArrayList<>();
    /**
     * Adds a graphic object to the composition.
     */
    public void add(GraphicObject graphic) {
        children.add(graphic);
    }
    /**
     * Removes the graphic object from the composition.
     */
    public void remove(GraphicObject graphic) {
        children.remove(graphic);
    }
    /**
     * Calls the draw method for all child objects,
     * recursively processing them as part of the composition.
     * Displays general information about the number of elements before rendering.
     */
    @Override
    public void draw() {
        System.out.println("Drawing CompositeGraphic with " + children.size() + " elements.");
        for (GraphicObject child : children) {
            child.draw();
        }
    }
}

