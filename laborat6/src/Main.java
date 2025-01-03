package work6;

/**
 * Головний клас для запуску системи підтримки.
 * <p>
 * Демонструє роботу системи обробки запитів, що використовує шаблон
 * "Ланцюжок обов'язків". Логіка побудована так, що кожен обробник
 * виконує свої обов'язки та передає запит далі, якщо не може його обробити.
 * </p>
 */
public class Main {

    /**
     * Точка входу в програму.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        // Створення обробників
        SupportOperator operator = new SupportOperator();
        SupportEngineer engineer = new SupportEngineer();
        SeniorSupportEngineer seniorEngineer = new SeniorSupportEngineer();

        // Налаштування ланцюжка обробки
        operator.setNextHandler(engineer);
        engineer.setNextHandler(seniorEngineer);

        // Створення запитів
        SupportRequest simpleRequest = new SupportRequest(1, "Простий запит");
        SupportRequest mediumRequest = new SupportRequest(2, "Середній запит");
        SupportRequest complexRequest = new SupportRequest(3, "Складний запит");
        SupportRequest unhandledRequest = new SupportRequest(4, "Запит вищого рівня складності");

        // Обробка запитів
        System.out.println("=== Початок обробки запитів ===");
        operator.handleRequest(simpleRequest);
        operator.handleRequest(mediumRequest);
        operator.handleRequest(complexRequest);
        operator.handleRequest(unhandledRequest);
        System.out.println("=== Кінець обробки запитів ===");
    }
}
