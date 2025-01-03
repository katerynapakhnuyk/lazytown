package work3;
/**
 * A main class that demonstrates the use of the Decorator pattern for handling text.
 */

public class Main {
    public static void main(String[] args) {
        TextElement text = new ConcreteText("Ознайомлення з видами шаблонів проектування ПЗ.");
        text = new UpperCaseDecorator(text);
        text = new NewLineDecorator(text);

        System.out.println(text.display());
    }
}

