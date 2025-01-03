package lab8;
/**
 * Основний клас Main
 * Демонструє використання паттернів "Фабричний метод" та "Одинак".
 */
public class Main {
    public static void main(String[] args) {
        // Create a factory for rectangular game spaces
        GameSpaceFactory factory = new RectangularGameSpaceFactory(800, 600);
        GameSpace gameSpace = factory.createGameSpace();

        // Render the game space
        gameSpace.render();

        // Load configuration using the Singleton
        ConfigLoader loader = ConfigurationLoader.getInstance();
        String configData = loader.loadConfigurationFromFile("config.txt");

        // Load the configuration into the game space
        gameSpace.loadConfig(configData);
    }
}