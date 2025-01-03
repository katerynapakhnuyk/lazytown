public interface ArenaMediator {
    void registerCharacter(CharacterUnit character);
    void sendAction(String action, CharacterUnit sender);
}
