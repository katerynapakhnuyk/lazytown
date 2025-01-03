package work6;

/**
 * Інтерфейс для обробки запитів.
 * <p>
 * Цей інтерфейс визначає базовий метод {@code handleRequest}, який реалізується
 * всіма обробниками запитів у системі підтримки.
 * </p>
 */
public interface RequestHandler {

    /**
     * Метод для обробки запиту.
     *
     * @param request запит, який потрібно обробити.
     */
    void handleRequest(SupportRequest request);
}
