package work7;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас {@code DrawingApp} надає механізм для управління та виконання команд
 * малювання графічних об'єктів.
 *
 * <p>Цей клас є прикладом використання шаблону проектування **Command**,
 * дозволяючи зберігати та виконувати множинні команди в порядку їх додавання.</p>
 */
public class DrawingApp {
    /**
     * Список команд для виконання.
     */
    private final List<Command> commands = new ArrayList<>();

    /**
     * Додає нову команду до списку для подальшого виконання.
     *
     * @param command об'єкт {@link Command}, який потрібно додати
     * @throws NullPointerException якщо {@code command} є {@code null}
     */
    public void addCommand(Command command) {
        if (command == null) {
            throw new NullPointerException("Команда не може бути null.");
        }
        commands.add(command);
    }

    /**
     * Виконує всі додані команди в порядку їх додавання.
     *
     * <p>Кожна команда зі списку викликає свій метод {@code execute},
     * що відповідає за виконання специфічної дії.</p>
     */
    public void drawShapes() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
