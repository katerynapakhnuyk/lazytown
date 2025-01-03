package work6;

/**
 * Клас для обробки запитів першого рівня.
 */
public class Operator extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getLevel() == 1;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Оператор підтримки обробляє запит: " + request.getDescription());
    }
}