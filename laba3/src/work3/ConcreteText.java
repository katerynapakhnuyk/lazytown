package work3;

/**
 *Implements a basic text element that can be modified by decorators
 */
public class ConcreteText implements TextElement {
    private String text;

    public ConcreteText(String text) {
        this.text = text;
    }

    @Override
    public String display() {
        return text;
    }
}


