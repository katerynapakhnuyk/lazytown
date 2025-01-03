package work5;

/**
 * Головний клас програми.
 * <p>
 * Цей клас є точкою входу в програму. Він демонструє використання геометричних фігур
 * та управління записами в базі даних через клас-посередник {@link DatabaseMediator}.
 * </p>
 */
public class Main {
    /**
     * Головний метод програми.
     * <p>
     * У цьому методі створюються об'єкти класів {@link Circle} та {@link Rectangle},
     * а також демонструється додавання, оновлення та видалення записів у базі даних
     * за допомогою {@link DatabaseMediator}.
     * </p>
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        // Використання шаблону Shape
        Circle circle = new Circle();
        circle.draw(5, 10);

        Rectangle rectangle = new Rectangle();
        rectangle.draw(15, 20);

        // Використання DatabaseMediator
        DatabaseMediator dbMediator = new DatabaseMediator();
        DatabaseRecord record1 = new DatabaseRecord(1, "Record 1");
        dbMediator.addRecord(record1);
        dbMediator.updateRecord(1, new DatabaseRecord(1, "Updated Record 1"));
        dbMediator.deleteRecord(1);
    }
}