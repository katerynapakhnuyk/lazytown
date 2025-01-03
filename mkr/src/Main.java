public class Main {
    public static void main(String[] args) {
        // Створення базового повідомлення
        Message message = new TextMessage("  Hello,  this is a test message!");
        System.out.println("Оригінальне повідомлення: " + message.getContent());

        // Шифрування
        message = new EncryptedMessage(message);
        System.out.println("Після шифрування: " + message.getContent());

        // Додавання дати та часу
        message = new TimestampMessage(message);
        System.out.println("Після додавання дати та часу: " + message.getContent());

        // Додавання автора
        message = new AuthorMessage(message);
        System.out.println("Після додавання автора: " + message.getContent());

        // Стиснення
        message = new CompressedMessage(message);
        System.out.println("Після стиснення: " + message.getContent());
    }
}
