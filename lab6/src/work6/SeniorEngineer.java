package work6;

/**
 * Клас для обробки запитів третього рівня.
 */
public class SeniorEngineer extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getLevel() == 3;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Старший інженер підтримки обробляє запит: " + request.getDescription());
    }
}