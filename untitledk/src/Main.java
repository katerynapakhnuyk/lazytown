public class Main {
    public static void main(String[] args) {
        // Створення точок
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);

        // Створення композиції
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(point1);
        composite.add(point2);

        // Виклик методу draw
        composite.draw();
    }
}
