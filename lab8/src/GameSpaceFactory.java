package lab8;
/**
 * Абстрактний клас GameSpaceFactory
 * Визначає фабричний метод для створення об'єктів GameSpace.
 */
abstract class GameSpaceFactory {
    /**
     * Абстрактний метод createGameSpace()
     * Створює об'єкт GameSpace.
     *
     * @return GameSpace - створений об'єкт
     */
    public abstract GameSpace createGameSpace();
}