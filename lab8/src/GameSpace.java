package lab8;
/**
 * Інтерфейс GameSpace
 * Описує поведінку ігрового простору.
 */
public interface GameSpace {
    /**
     * Метод render()
     * Відображає ігровий простір.
     */
    void render();
    /**
     * Метод loadConfig(String configData)
     * Завантажує конфігурацію в ігровий простір.
     *
     * @param configData - дані конфігурації
     */
    void loadConfig(String configData);
}
