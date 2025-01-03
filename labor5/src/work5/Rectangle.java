package work5;

/**
 * Клас, що представляє прямокутник.
 * <p>
 * Цей клас реалізує інтерфейс {@link Shape} і надає реалізацію методу {@code draw},
 * який виводить координати, де повинно бути намальоване прямокутник.
 * </p>
 */
public class Rectangle implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Метод draw прямокутника з параметрами x=" + x + " y=" + y);
    }
}