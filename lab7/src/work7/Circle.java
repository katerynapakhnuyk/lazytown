package work7;

/**
 * Клас {@code Circle} представляє графічний примітив коло,
 * що реалізує інтерфейс {@link Shape}.
 * Він підтримує функціональність малювання, збереження та відновлення стану.
 */
public class Circle implements Shape {
    /**
     * Колір кола.
     */
    private String color;

    /**
     * Координата X центру кола.
     */
    private int x;

    /**
     * Координата Y центру кола.
     */
    private int y;

    /**
     * Радіус кола.
     */
    private int radius;

    /**
     * Конструктор для створення об'єкта {@code Circle}.
     *
     * @param color  колір кола
     * @param x      координата X центру кола
     * @param y      координата Y центру кола
     * @param radius радіус кола
     */
    public Circle(String color, int x, int y, int radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Малює коло, виводячи інформацію про нього у консоль.
     */
    @Override
    public void draw() {
        System.out.println("Малюємо коло: колір=" + color + ", позиція=(" + x + ", " + y + "), радіус=" + radius);
    }

    /**
     * Зберігає поточний стан об'єкта {@code Circle}.
     *
     * @return об'єкт {@code Memento}, що містить стан кола у вигляді строки
     */
    @Override
    public Memento saveState() {
        return new Memento(color + "," + x + "," + y + "," + radius);
    }

    /**
     * Відновлює стан об'єкта {@code Circle} з переданого об'єкта {@code Memento}.
     *
     * @param memento об'єкт {@code Memento}, який містить збережений стан
     * @throws NumberFormatException якщо дані у {@code Memento} не можуть бути коректно перетворені у числові значення
     */
    @Override
    public void restoreState(Memento memento) {
        String[] state = memento.getState().split(",");
        this.color = state[0];
        this.x = Integer.parseInt(state[1]);
        this.y = Integer.parseInt(state[2]);
        this.radius = Integer.parseInt(state[3]);
    }
}
