package work5;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас-посередник для управління записами в базі даних.
 */
public class DatabaseMediator implements DatabaseManager {
    private Map<Integer, DatabaseRecord> database = new HashMap<>();

    @Override
    public void addRecord(DatabaseRecord record) {
        database.put(record.getId(), record);
        System.out.println("Додано запис з ID=" + record.getId());
    }

    @Override
    public void updateRecord(int id, DatabaseRecord record) {
        if (database.containsKey(id)) {
            database.put(id, record);
            System.out.println("Оновлено запис з ID=" + id);
        } else {
            System.out.println("Запис з ID=" + id + " не знайдено.");
        }
    }

    @Override
    public void deleteRecord(int id) {
        if (database.remove(id) != null) {
            System.out.println("Видалено запис з ID=" + id);
        } else {
            System.out.println("Запис з ID=" + id + " не знайдено.");
        }
    }
}