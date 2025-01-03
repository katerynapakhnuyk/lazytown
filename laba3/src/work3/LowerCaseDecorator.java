package work3;
/**
 *Decorator to lowercase text
 */
public class LowerCaseDecorator extends TextDecorator {

    public LowerCaseDecorator(TextElement element) {
        super(element);
    }

    @Override
    public String display() {
        // Заглушка для методу display
        System.out.println("LowerCaseDecorator. Приведення до нижнього регістру.");
        return element.display().toLowerCase();
    }
}

