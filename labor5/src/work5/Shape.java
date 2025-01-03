package work5;

/**
 * Інтерфейс для геометричних фігур.
 * <p>
 * Цей інтерфейс визначає методи, які повинні реалізувати всі геометричні фігури.
 * Метод {@code draw} відповідає за малювання фігури на заданих координатах.
 * </p>
 */
public interface Shape {
    /**
     * Малює фігуру на заданих координатах.
     *
     * @param x координата по осі X
     * @param y координата по осі Y
     */
    void draw(int x, int y);
}