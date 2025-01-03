package work6;

/**
 * Головний клас для тестування системи обробки запитів на технічну підтримку.
 */
public class Main {
    public static void main(String[] args) {
        // Створення обробників
        SupportHandler operator = new Operator();
        SupportHandler engineer = new Engineer();
        SupportHandler seniorEngineer = new SeniorEngineer();

        // Налаштування ланцюга обробників
        operator.setNextHandler(engineer);
        engineer.setNextHandler(seniorEngineer);

        // Створення запитів різних рівнів
        SupportRequest request1 = new TechnicalSupportRequest("Не можу увійти в систему", 1);
        SupportRequest request2 = new TechnicalSupportRequest("Помилка при оновленні", 2);
        SupportRequest request3 = new TechnicalSupportRequest("Системний збій", 3);
        SupportRequest request4 = new TechnicalSupportRequest("Невідома проблема", 4); // Запит, який не може бути оброблений

        // Обробка запитів
        System.out.println("Обробка запиту 1:");
        operator.handleRequest(request1);

        System.out.println("\nОбробка запиту 2:");
        operator.handleRequest(request2);

        System.out.println("\nОбробка запиту 3:");
        operator.handleRequest(request3);

        System.out.println("\nОбробка запиту 4:");
        operator.handleRequest(request4);
    }
}