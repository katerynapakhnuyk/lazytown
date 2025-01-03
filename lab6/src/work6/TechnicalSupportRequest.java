package work6;

/**
 * Клас, що реалізує запит на технічну підтримку.
 */
public class TechnicalSupportRequest implements SupportRequest {
    private String description;
    private int level;

    /**
     * Конструктор для створення запиту на технічну підтримку.
     *
     * @param description опис запиту
     * @param level рівень складності запиту
     */
    public TechnicalSupportRequest(String description, int level) {
        this.description = description;
        this.level = level;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getLevel() {
        return level;
    }
}