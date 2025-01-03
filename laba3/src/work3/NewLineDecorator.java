package work3;
/**
 *Decorator for adding a newline character at the end of text
 */
public class NewLineDecorator extends TextDecorator {

    public NewLineDecorator(TextElement element) {
        super(element);
    }

    @Override
    public String display() {
        // Заглушка для методу display
        System.out.println("NewLineDecorator. Додавання нового рядка.");
        return element.display() + "\n";
    }
}


