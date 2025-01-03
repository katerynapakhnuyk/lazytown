package work7;

/**
 * Клас {@code Triangle} реалізує інтерфейс {@link Shape}
 * і представляє трикутник з кольором та координатами його вершин.
 *
 * <p>Цей клас підтримує операції малювання, збереження стану
 * і відновлення стану трикутника.</p>
 */
public class Triangle implements Shape {
    /**
     * Колір трикутника.
     */
    private String color;

    /**
     * Координати першої вершини трикутника.
     */
    private int x1, y1;

    /**
     * Координати другої вершини трикутника.
     */
    private int x2, y2;

    /**
     * Координати третьої вершини трикутника.
     */
    private int x3, y3;

    /**
     * Конструктор для створення трикутника з заданим кольором і координатами вершин.
     *
     * @param color колір трикутника
     * @param x1 координата X першої вершини
     * @param y1 координата Y першої вершини
     * @param x2 координата X другої вершини
     * @param y2 координата Y другої вершини
     * @param x3 координата X третьої вершини
     * @param y3 координата Y третьої вершини
     * @throws NullPointerException якщо {@code color} є {@code null}
     */
    public Triangle(String color, int x1, int y1, int x2, int y2, int x3, int y3) {
        if (color == null) {
            throw new NullPointerException("Колір не може бути null.");
        }
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    /**
     * Малює трикутник, виводячи його характеристики в консоль.
     */
    @Override
    public void draw() {
        System.out.println("Малюємо трикутник: колір=" + color + ", координати=("
                + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + ")");
    }

    /**
     * Зберігає поточний стан трикутника.
     *
     * @return об'єкт {@link Memento}, що містить стан трикутника
     */
    @Override
    public Memento saveState() {
        return new Memento(color + "," + x1 + "," + y1 + "," + x2 + "," + y2 + "," + x3 + "," + y3);
    }

    /**
     * Відновлює стан трикутника з переданого {@link Memento}.
     *
     * @param memento об'єкт {@link Memento}, що містить стан для відновлення
     * @throws NullPointerException якщо {@code memento} є {@code null}
     * @throws IllegalArgumentException якщо стан у {@code memento} некоректний
     */
    @Override
    public void restoreState(Memento memento) {
        if (memento == null) {
            throw new NullPointerException("Memento не може бути null.");
        }
        String[] state = memento.getState().split(",");
        if (state.length != 7) {
            throw new IllegalArgumentException("Некоректний формат стану у Memento.");
        }
        this.color = state[0];
        this.x1 = Integer.parseInt(state[1]);
        this.y1 = Integer.parseInt(state[2]);
        this.x2 = Integer.parseInt(state[3]);
        this.y2 = Integer.parseInt(state[4]);
        this.x3 = Integer.parseInt(state[5]);
        this.y3 = Integer.parseInt(state[6]);
    }
}
