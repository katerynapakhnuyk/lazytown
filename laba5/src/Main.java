package work3;

import java.util.NoSuchElementException;

/**
 * Головний клас для реалізації ітератора зв'язного списку.
 */
public class Main<T> {
    private Node<T> current; // Поточний вузол для ітерації

    /**
     * Конструктор, який ініціалізує ітератор з голови списку.
     *
     * @param head голова списку
     */
    public Main(Node<T> head) {
        this.current = head; // Встановлюємо поточний вузол на голову списку
    }

    /**
     * Перевіряє, чи є наступний елемент у списку.
     *
     * @return true, якщо є наступний елемент, інакше false
     */
    public boolean hasNext() {
        return current != null; // Повертає true, якщо поточний вузол не є null
    }

    /**
     * Повертає наступний елемент списку.
     *
     * @return наступний елемент
     * @throws NoSuchElementException якщо немає наступного елемента
     */
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Немає більше елементів для ітерації"); // Викидаємо виключення, якщо немає наступного елемента
        }
        T data = current.getData(); // Зберігаємо дані поточного вузла
        current = current.getNext(); // Переходимо до наступного вузла
        return data; // Повертаємо дані
    }

    /**
     * Скидає ітератор до початку списку.
     */
    public void reset(Node<T> head) {
        this.current = head; // Встановлюємо поточний вузол на голову списку
    }

    public static void main(String[] args) {
        // Створення зв'язного списку
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); // Додаємо перший елемент
        list.add(2); // Додаємо другий елемент
        list.add(3); // Додаємо третій елемент



        // Використання ітератора
        Main<Integer> iterator = new Main<>(list.getHead()); // Ініціалізуємо ітератор з голови списку
        while (iterator.hasNext()) { // Поки є наступні елементи
            System.out.println("Наступний елемент: " + iterator.next()); // Виводимо наступний елемент
        }

        list.printForward(); // Виведе: 1, 2, 3
        list.printBackward(); // Виведе: 3, 2, 1
    }
}