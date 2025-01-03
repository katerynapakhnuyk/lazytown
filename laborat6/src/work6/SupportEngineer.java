package work6;

/**
 * Інженер підтримки для обробки запитів середнього рівня складності (рівень 2).
 * <p>
 * Якщо рівень складності запиту не відповідає його можливостям,
 * передає запит наступному обробнику.
 * </p>
 */
public class SupportEngineer extends BaseHandler {

    /**
     * Обробляє запит із рівнем складності 2 або передає його далі.
     *
     * @param request запит, який потрібно обробити.
     */
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getComplexityLevel() == 2) {
            System.out.println("Інженер підтримки обробляє запит: " + request.getDescription());
        } else {
            System.out.println("Інженер підтримки передає запит далі.");
            super.handleRequest(request);
        }
    }
}
