public class PlayerCharacter extends CharacterUnit {
    public PlayerCharacter(ArenaMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendAction(String action) {
        System.out.println(this.name + " sends action: " + action);
        mediator.sendAction(action, this);
    }

    @Override
    public void receiveAction(String action) {
        System.out.println(this.name + " receives action: " + action);
    }
}
