package work3;

/**
 *A base class for all decorators that provides new functionality to text elements
 */
public abstract class TextDecorator implements TextElement {
    protected TextElement element;

    public TextDecorator(TextElement element) {
        this.element = element;
    }

    @Override
    public String display() {
        return element.display();
    }
}
