// Клас, який представляє точку (примітивний об'єкт)
        public class Point implements GraphicObject {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Point at (" + x + ", " + y + ")");
    }
}

