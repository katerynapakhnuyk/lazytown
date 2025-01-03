package lab8;
/**
 * Клас RectangularGameSpaceFactory
 * Реалізує фабрику для створення RectangularGameSpace.
 */
public class RectangularGameSpaceFactory extends GameSpaceFactory {
    private int width;
    private int height;
    /**
     * Конструктор RectangularGameSpaceFactory
     *
     * @param width - ширина ігрового простору
     * @param height - висота ігрового простору
     */
    public RectangularGameSpaceFactory(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public GameSpace createGameSpace() {
        return new RectangularGameSpace(width, height);
    }
}