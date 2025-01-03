package work6;

/**
 * Клас для обробки запитів другого рівня.
 */
public class Engineer extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getLevel() == 2;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Інженер підтримки обробляє запит: " + request.getDescription());
    }
}