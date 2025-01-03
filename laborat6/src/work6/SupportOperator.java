package work6;

/**
 * Оператор підтримки для обробки простих запитів (рівень 1).
 * <p>
 * Якщо рівень складності запиту не відповідає його можливостям,
 * передає запит наступному обробнику.
 * </p>
 */
public class SupportOperator extends BaseHandler {

    /**
     * Обробляє запит із рівнем складності 1 або передає його далі.
     *
     * @param request запит, який потрібно обробити.
     */
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getComplexityLevel() == 1) {
            System.out.println("Оператор підтримки обробляє запит: " + request.getDescription());
        } else {
            System.out.println("Оператор підтримки передає запит далі.");
            super.handleRequest(request);
        }
    }
}
