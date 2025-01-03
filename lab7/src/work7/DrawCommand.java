package work7;

/**
 * Клас {@code DrawCommand} реалізує інтерфейс {@link Command}
 * і відповідає за виконання операції малювання заданої форми.
 *
 * <p>Цей клас застосовує шаблон проектування **Command** для інкапсуляції
 * дії малювання у вигляді окремого об'єкта, що дозволяє передавати команди
 * як параметри, зберігати історію виконання або виконувати їх пізніше.</p>
 */
public class DrawCommand implements Command {
    /**
     * Об'єкт {@link Shape}, який буде намальовано.
     */
    private final Shape shape;

    /**
     * Конструктор для створення об'єкта {@code DrawCommand}.
     *
     * @param shape об'єкт {@link Shape}, який потрібно намалювати
     * @throws NullPointerException якщо {@code shape} є {@code null}
     */
    public DrawCommand(Shape shape) {
        if (shape == null) {
            throw new NullPointerException("Shape не може бути null.");
        }
        this.shape = shape;
    }

    /**
     * Виконує команду малювання для заданої форми.
     */
    @Override
    public void execute() {
        shape.draw();
    }
}
