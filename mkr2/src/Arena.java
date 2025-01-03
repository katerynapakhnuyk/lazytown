import java.util.ArrayList;
import java.util.List;

public class Arena implements ArenaMediator {
    private List<CharacterUnit> characters = new ArrayList<>();

    @Override
    public void registerCharacter(CharacterUnit character) {
        characters.add(character);
    }

    @Override
    public void sendAction(String action, CharacterUnit sender) {
        for (CharacterUnit character : characters) {
            if (character != sender) {
                character.receiveAction(action);
            }
        }
    }
}
