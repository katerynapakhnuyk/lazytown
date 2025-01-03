package lab8;
/**
 * Клас RectangularGameSpace
 * Реалізує інтерфейс GameSpace для прямокутного ігрового простору.
 */
// Реалізація RectangularGameSpace
public class RectangularGameSpace implements GameSpace {
    // Поля класу для зберігання ширини і висоти
    private int width;
    private int height;

    // Конструктор для ініціалізації ширини та висоти
    public RectangularGameSpace(int width, int height) {
        this.width = width; // Присвоєння параметра полю класу
        this.height = height; // Присвоєння параметра полю класу
    }

    @Override
    public void render() {
        // Використання полів класу для доступу до ширини і висоти
        System.out.println("Візуалізація прямокутного ігрового простору розміром: " + width + "x" + height);
    }

    @Override
    public void loadConfig(String configData) {
        System.out.println("Завантаження конфігурації`: " + configData);
    }
}
