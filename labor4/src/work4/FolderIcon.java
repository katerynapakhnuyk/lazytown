package work4;

/**
 * Клас FolderIcon реалізує інтерфейс Icon для представлення директорій.
 */
public class FolderIcon implements Icon {
    private String name; // Внутрішній стан (ім'я директорії)

    public FolderIcon(String name) {
        this.name = name;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Метод draw для директорії '" + name + "' з параметрами x=" + x + ", y=" + y);
    }
}