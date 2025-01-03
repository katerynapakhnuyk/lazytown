package work6;

/**
 * Базовий клас для обробників запитів.
 * <p>
 * Реалізує загальну логіку передачі запиту наступному обробнику в ланцюжку,
 * якщо поточний обробник не може обробити запит.
 * </p>
 */
public abstract class BaseHandler implements RequestHandler {
    /**
     * Наступний обробник у ланцюжку.
     */
    protected RequestHandler nextHandler;

    /**
     * Встановлює наступного обробника в ланцюжку.
     *
     * @param nextHandler об'єкт наступного обробника.
     */
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Базовий метод обробки запиту.
     * Передає запит наступному обробнику, якщо він існує.
     *
     * @param request запит, який потрібно обробити.
     */
    @Override
    public void handleRequest(SupportRequest request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Запит не може бути оброблений: " + request.getDescription());
        }
    }
}
