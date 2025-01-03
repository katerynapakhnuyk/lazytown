package lab8;
/**
 * Інтерфейс ConfigLoader
 * Визначає поведінку завантажувача конфігурацій.
 */
public interface ConfigLoader {
    /**
     * Метод loadConfigurationFromFile(String filePath)
     * Завантажує конфігурацію з файлу.
     *
     * @param filePath - шлях до файлу
     * @return String - дані конфігурації
     */
    String loadConfigurationFromFile(String filePath);
}
