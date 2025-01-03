package work4;

/**
 * Клас FileIcon реалізує інтерфейс Icon для представлення файлів.
 */
public class FileIcon implements Icon {
    private String type; // Внутрішній стан (тип файлу)

    public FileIcon(String type) {
        this.type = type;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Метод draw для файлу типу '" + type + "' з параметрами x=" + x + ", y=" + y);
    }
}