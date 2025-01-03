package work3;

/**
 * Клас, що реалізує зв'язний список.
 *
 * @param <T> тип даних, що зберігається в списку
 */
public class LinkedList<T> {
    private Node<T> head; // Голова списку

    /**
     * Конструктор, який ініціалізує порожній список.
     */
    public LinkedList() {
        this.head = null; // Список спочатку порожній
    }

    /**
     * Додає новий елемент до кінця списку.
     *
     * @param data дані, які потрібно додати
     */
    public void add(T data) {
        System.out.println("Метод add з параметром data=" + data);
        Node<T> newNode = new Node<>(data); // Створюємо новий вузол
        if (head == null) { // Якщо список порожній
            head = newNode; // Новий вузол стає головою
        } else {
            Node<T> current = head; // Починаємо з голови
            while (current.getNext() != null) { // Проходимо до останнього вузла
                current = current.getNext();
            }
            current.setNext(newNode); // Додаємо новий вузол в кінець
        }
    }

    /**
     * Видаляє елемент зі списку.
     *
     * @param data дані, які потрібно видалити
     */
    public void remove(T data) {
        System.out.println("Метод remove з параметром data=" + data);
        if (head == null) return; // Якщо список порожній, нічого не робимо

        if (head.getData().equals(data)) { // Якщо голова - це елемент для видалення
            head = head.getNext(); // Змінюємо голову на наступний вузол
            return;
        }

        Node<T> current = head; // Починаємо з голови
        while (current.getNext() != null) { // Проходимо до останнього вузла
            if (current.getNext().getData().equals(data)) { // Знайшли елемент для видалення
                current.setNext(current.getNext().getNext()); // Пропускаємо видаляємий вузол
                return;
            }
            current = current.getNext();
        }
    }

    /**
     * Друкує елементи списку в прямому порядку.
     */
    public void printForward() {
        System.out.println("Метод printForward викликано");
        Node<T> current = head; // Починаємо з голови
        while (current != null) { // Проходимо до кінця списку
            System.out.println(current.getData()); // Друкуємо дані вузла
            current = current.getNext(); // Переходимо до наступного вузла
        }
    }

    /**
     * Друкує елементи списку у зворотному порядку.
     */
    public void printBackward() {
        System.out.println("Метод printBackward викликано");
        printBackwardRecursive(head); // Викликаємо рекурсивний метод

    }

    /**
     * Рекурсивний метод для друку елементів списку у зворотному порядку.
     *
     * @param node вузол, з якого починається друк
     */
    private void printBackwardRecursive(Node<T> node) {
        if (node == null) return; // Якщо вузол порожній, виходимо
        printBackwardRecursive(node.getNext()); // Рекурсивно переходимо до наступного вузла
        System.out.println(node.getData()); // Друкуємо дані вузла після повернення з рекурсії
    }

    /**
     * Повертає голову списку.
     *
     * @return голова списку
     */
    public Node<T> getHead() {
        return head; // Повертає посилання на голову списку
    }
}