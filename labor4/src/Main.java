package work4;
import java.util.List;
import java.util.ArrayList;
/**
 * Головний клас програми, що запускає графічний інтерфейс файлової системи.
 */
public class Main {
    public static void main(String[] args) {
        IconFactory iconFactory = new IconFactory();
        List<Icon> icons = new ArrayList<>();

        // Додаємо файли
        icons.add(iconFactory.getIcon("Document", false));
        icons.add(iconFactory.getIcon("Image", false));
        icons.add(iconFactory.getIcon("Audio", false));

        // Додаємо директорії
        icons.add(iconFactory.getIcon("Photos", true));
        icons.add(iconFactory.getIcon("Documents", true));

        // Малюємо іконки
        for (int i = 0; i < icons.size(); i++) {
            icons.get(i).draw(i * 10, i * 10);
        }
    }
}