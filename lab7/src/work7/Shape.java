package work7;

/**
 * Інтерфейс {@code Shape} визначає контракт для графічних примітивів,
 * які можуть бути намальовані, а також підтримують збереження та відновлення свого стану.
 *
 * <p>Цей інтерфейс може бути реалізований будь-яким класом, що представляє графічний об'єкт.</p>
 */
public interface Shape {
    /**
     * Малює графічний об'єкт.
     *
     * <p>Метод виконує операцію візуалізації або симуляцію цієї операції (наприклад,
     * вивід інформації про об'єкт у консоль).</p>
     */
    void draw();

    /**
     * Зберігає поточний стан об'єкта.
     *
     * @return об'єкт {@link Memento}, що містить збережений стан
     */
    Memento saveState();

    /**
     * Відновлює стан об'єкта з переданого {@link Memento}.
     *
     * @param memento об'єкт {@link Memento}, що містить стан для відновлення
     * @throws NullPointerException якщо {@code memento} є {@code null}
     * @throws IllegalArgumentException якщо стан у {@code memento} некоректний
     * або несумісний з цим об'єктом
     */
    void restoreState(Memento memento);
}
