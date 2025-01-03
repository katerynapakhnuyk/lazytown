package work6;

/**
 * Клас, що представляє запит на технічну підтримку.
 * <p>
 * Запит містить рівень складності та опис проблеми.
 * Рівень складності використовується для визначення, який обробник повинен
 * займатися цим запитом.
 * </p>
 */
public class SupportRequest {
    private int complexityLevel; // Рівень складності запиту
    private String description;  // Опис запиту

    /**
     * Конструктор для створення нового запиту.
     *
     * @param complexityLevel рівень складності запиту (1 - простий, 2 - середній, 3 - складний).
     * @param description     опис запиту.
     */
    public SupportRequest(int complexityLevel, String description) {
        this.complexityLevel = complexityLevel;
        this.description = description;
    }

    /**
     * Отримати рівень складності запиту.
     *
     * @return рівень складності (int).
     */
    public int getComplexityLevel() {
        return complexityLevel;
    }

    /**
     * Отримати опис запиту.
     *
     * @return опис запиту (String).
     */
    public String getDescription() {
        return description;
    }
}
