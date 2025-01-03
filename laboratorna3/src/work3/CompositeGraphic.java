package work3;

import java.util.ArrayList;
import java.util.List;

/**
 * The CompositeGraphic class represents a composition of graphical objects,
 * allowing primitives and other composites to be grouped together.
 * This class implements the Graphic interface and provides methods to manage
 * constituent objects.
 */
public class CompositeGraphic implements Graphic {

    /** List of graphical objects that make up this composite. */
    private List<Graphic> children = new ArrayList<>();

    /**
     * Adds a graphical object to the composite.
     *
     * @param graphic the graphical object to be added
     */
    public void add(Graphic graphic) {
        children.add(graphic);
    }

    /**
     * Removes a graphical object from the composite.
     *
     * @param graphic the graphical object to be removed
     */
    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

    /**
     * Displays the composite object by calling the draw() method on each
     * child object within the composite.
     */
    @Override
    public void draw() {
        for (Graphic graphic : children) {
            graphic.draw();
        }
    }

    /**
     * Calculates and returns the minimum X coordinate among all child objects.
     *
     * @return the minimum X coordinate of the composite
     */
    @Override
    public int getX() {
        return children.stream().mapToInt(Graphic::getX).min().orElse(0);
    }

    /**
     * Calculates and returns the minimum Y coordinate among all child objects.
     *
     * @return the minimum Y coordinate of the composite
     */
    @Override
    public int getY() {
        return children.stream().mapToInt(Graphic::getY).min().orElse(0);
    }

    /**
     * Calculates and returns the maximum width among all child objects.
     *
     * @return the maximum width of the composite
     */
    @Override
    public int getWidth() {
        return children.stream().mapToInt(Graphic::getWidth).max().orElse(0);
    }

    /**
     * Calculates and returns the maximum height among all child objects.
     *
     * @return the maximum height of the composite
     */
    @Override
    public int getHeight() {
        return children.stream().mapToInt(Graphic::getHeight).max().orElse(0);
    }
}
