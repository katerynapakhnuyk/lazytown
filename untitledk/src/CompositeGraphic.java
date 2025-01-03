// Клас, який представляє композицію графічних об'єктів
import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements GraphicObject {
    private List<GraphicObject> children = new ArrayList<>();

    public void add(GraphicObject graphic) {
        children.add(graphic);
    }

    public void remove(GraphicObject graphic) {
        children.remove(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Drawing CompositeGraphic with " + children.size() + " elements.");
        for (GraphicObject child : children) {
            child.draw();
        }
    }
}