package work7;

/**
 * Головний клас програми {@code Main}, що демонструє використання
 * шаблонів проектування Command і Memento для роботи з графічними об'єктами.
 *
 * <p>Програма включає наступні дії:</p>
 * <ul>
 *   <li>Створення графічних об'єктів (коло і трикутник).</li>
 *   <li>Збереження початкових станів об'єктів.</li>
 *   <li>Створення команд для малювання об'єктів.</li>
 *   <li>Використання {@code DrawingApp} для виконання команд.</li>
 *   <li>Зміна станів об'єктів та їх відображення.</li>
 *   <li>Відновлення початкових станів і повторне відображення.</li>
 * </ul>
 */
public class Main {
    /**
     * Точка входу в програму.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        // Створюємо графічні елементи
        Circle circle = new Circle("Червоний", 10, 20, 15);
        Triangle triangle = new Triangle("Синій", 0, 0, 10, 0, 5, 10);

        // Зберігаємо початкові стани
        Memento circleMemento = circle.saveState();
        Memento triangleMemento = triangle.saveState();

        // Створюємо команди для малювання
        Command drawCircle = new DrawCommand(circle);
        Command drawTriangle = new DrawCommand(triangle);

        // Створюємо інстанс DrawingApp
        DrawingApp drawingApp = new DrawingApp();
        drawingApp.addCommand(drawCircle);
        drawingApp.addCommand(drawTriangle);

        // Малюємо графічні елементи
        System.out.println("Малюємо графічні елементи:");
        drawingApp.drawShapes();

        // Змінюємо стан графічних елементів
        circle.restoreState(new Memento("Зелений,30,40,20"));
        triangle.restoreState(new Memento("Жовтий,1,1,11,1,6,11"));

        // Малюємо знову
        System.out.println("\nМалюємо графічні елементи після зміни стану:");
        drawingApp.drawShapes();

        // Відновлюємо початкові стани
        circle.restoreState(circleMemento);
        triangle.restoreState(triangleMemento);

        // Малюємо знову
        System.out.println("\nМалюємо графічні елементи після відновлення стану:");
        drawingApp.drawShapes();
    }
}
