package work5;

/**
 * Клас, що представляє запис у базі даних.
 * <p>
 * Цей клас містить інформацію про запис, включаючи його ідентифікатор та дані.
 * </p>
 */
public class DatabaseRecord {
    private int id;
    private String data;

    /**
     * Конструктор для створення нового запису.
     *
     * @param id   ідентифікатор запису
     * @param data дані запису
     */
    public DatabaseRecord(int id, String data) {
        this.id = id;
        this.data = data;
    }

    /**
     * Отримує ідентифікатор запису.
     *
     * @return ідентифікатор запису
     */
    public int getId() {
        return id;
    }

    /**
     * Отримує дані запису.
     *
     * @return дані запису
     */
    public String getData() {
        return data;
    }
}