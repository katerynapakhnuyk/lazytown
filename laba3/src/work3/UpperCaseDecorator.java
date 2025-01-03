package work3;

/**
 *Decorator to bring the text to the upper case:
 */
public class UpperCaseDecorator extends TextDecorator {

    public UpperCaseDecorator(TextElement element) {
        super(element);
    }

    @Override
    public String display() {
        // Заглушка для методу display
        System.out.println("UpperCaseDecorator. Приведення до верхнього регістру.");
        return element.display().toUpperCase();
    }
}

