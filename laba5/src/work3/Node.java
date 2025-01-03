package work3;

/**
 * Клас, що представляє вузол зв'язного списку.
 *
 * @param <T> тип даних, що зберігається в вузлі
 */
public class Node<T> {
    private T data; // Дані, що зберігаються в вузлі
    private Node<T> next; // Посилання на наступний вузол

    /**
     * Конструктор, який ініціалізує вузол з даними.
     *
     * @param data дані, які зберігатимуться в вузлі
     */
    public Node(T data) {
        this.data = data; // Зберігаємо дані
        this.next = null; // Наступний вузол поки що не заданий
    }

    public T getData() {
        return data; // Повертає дані вузла
    }

    public Node<T> getNext() {
        return next; // Повертає посилання на наступний вузол
    }

    public void setNext(Node<T> next) {
        this.next = next; // Встановлює посилання на наступний вузол
    }
}