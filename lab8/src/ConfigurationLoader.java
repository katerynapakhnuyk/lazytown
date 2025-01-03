package lab8;
/**
 * Клас ConfigurationLoader
 * Реалізує Singleton для завантаження конфігурацій.
 */
public class ConfigurationLoader implements ConfigLoader {
    private static ConfigurationLoader instance;
    /**
     * Приватний конструктор ConfigurationLoader
     * Запобігає створенню об'єктів напряму.
     */
    private ConfigurationLoader() {}

    /**
     * Метод getInstance()
     * Повертає єдиний екземпляр ConfigurationLoader.
     *
     * @return ConfigurationLoader - екземпляр Singleton
     */
    public static ConfigurationLoader getInstance() {
        if (instance == null) {
            instance = new ConfigurationLoader();
        }
        return instance;
    }

    @Override
    public String loadConfigurationFromFile(String filePath) {
        System.out.println("Завантаження конфігурації з файлу: " + filePath);
        return "Зразок даних конфігурації з " + filePath;
    }
}
