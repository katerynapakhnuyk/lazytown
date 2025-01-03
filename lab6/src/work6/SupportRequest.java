package work6;

/**
 * Інтерфейс для запитів на технічну підтримку.
 */
public interface SupportRequest {
    /**
     * Отримати опис запиту.
     *
     * @return опис запиту
     */
    String getDescription();

    /**
     * Отримати рівень запиту.
     *
     * @return рівень запиту
     */
    int getLevel();
}