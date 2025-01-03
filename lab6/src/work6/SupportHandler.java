package work6;

/**
 * Абстрактний клас для обробки запитів на технічну підтримку.
 */
public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    /**
     * Встановити наступного обробника запитів.
     *
     * @param nextHandler наступний обробник
     */
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Шаблонний метод для обробки запитів.
     *
     * @param request запит на технічну підтримку
     */
    public final void handleRequest(SupportRequest request) {
        if (canHandle(request)) {
            processRequest(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Запит не може бути оброблений.");
        }
    }

    /**
     * Перевірити, чи може обробник обробити запит.
     *
     * @param request запит на технічну підтримку
     * @return true, якщо обробник може обробити запит; false в іншому випадку
     */
    protected abstract boolean canHandle(SupportRequest request);

    /**
     * Обробити запит.
     *
     * @param request запит на технічну підтримку
     */
    protected abstract void processRequest(SupportRequest request);
}