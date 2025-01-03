package work5;

/**
 * Клас, що представляє коло.
 * <p>
 * Цей клас реалізує інтерфейс {@link Shape} і надає реалізацію методу {@code draw},
 * який виводить координати, де повинно бути намальоване коло.
 * </p>
 */
public class Circle implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Метод draw кола з параметрами x=" + x + " y=" + y);
    }
}