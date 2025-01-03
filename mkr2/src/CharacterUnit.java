public abstract class CharacterUnit {
    protected ArenaMediator mediator;
    protected String name;

    public CharacterUnit(ArenaMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendAction(String action);
    public abstract void receiveAction(String action);
}
