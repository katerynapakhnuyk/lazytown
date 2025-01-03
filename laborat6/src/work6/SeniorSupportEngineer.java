package work6;

/**
 * Старший інженер підтримки для обробки складних запитів (рівень 3).
 * <p>
 * Якщо рівень складності запиту перевищує можливості системи,
 * запит залишається необробленим.
 * </p>
 */
public class SeniorSupportEngineer extends BaseHandler {

    /**
     * Обробляє запит із рівнем складності 3 або завершує обробку.
     *
     * @param request запит, який потрібно обробити.
     */
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getComplexityLevel() == 3) {
            System.out.println("Старший інженер підтримки обробляє запит: " + request.getDescription());
        } else {
            System.out.println("Запит занадто складний для обробки: " + request.getDescription());
            super.handleRequest(request);
        }
    }
}
