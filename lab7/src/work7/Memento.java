package work7;

/**
 * Клас {@code Memento} реалізує шаблон проектування Memento,
 * дозволяючи зберігати та відновлювати стан об'єкта без порушення інкапсуляції.
 *
 * <p>Клас використовується для збереження стану об'єкта як строки,
 * що дозволяє відновити цей стан пізніше.</p>
 */
public class Memento {
    /**
     * Збережений стан об'єкта у вигляді строки.
     */
    private final String state;

    /**
     * Конструктор для створення об'єкта {@code Memento}.
     *
     * @param state стан об'єкта, який потрібно зберегти
     * @throws NullPointerException якщо {@code state} є {@code null}
     */
    public Memento(String state) {
        if (state == null) {
            throw new NullPointerException("Стан не може бути null.");
        }
        this.state = state;
    }

    /**
     * Повертає збережений стан.
     *
     * @return стан об'єкта у вигляді строки
     */
    public String getState() {
        return state;
    }
}
